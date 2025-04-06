package colorgame;

import java.util.*;

import static colorgame.Status.*;

public class GameController {
  private final Game game;
  private final int maxAttempts;
  private final List<Color> selectedColors;
  private final Scanner scanner;

  public GameController(Game game, int maxAttempts, List<Color> selectedColors, Scanner scanner) {
    this.game = game;
    this.maxAttempts = maxAttempts;
    this.selectedColors = selectedColors;
    this.scanner = scanner;
  }

  public void playGame() {
    printWelcomeMessage();
    Status gameStatus = IN_PROGRESS;
    int attempt = 1;

    while (gameStatus == IN_PROGRESS && attempt <= maxAttempts) {
        List<Color> userColors = getUserInput();
        Tuple result = game.play(selectedColors, userColors, maxAttempts);
        gameStatus = result.status;
        attempt = result.attempt;

        displayResult(result);
        printGameStatus(gameStatus);
    }

    scanner.close();
}

private void printWelcomeMessage() {
    System.out.println("ANNOR LUU Color Guessing Game!");
    System.out.println("Try to guess the 6 colors in the correct order.");
    System.out.println("Color Bank: RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, WHITE, CYAN, VIOLET, MOCHA");
}

private void printGameStatus(Status gameStatus) {
    if (gameStatus == WON) {
        System.out.println("You've guessed the correct colors!");
    } else if (gameStatus == LOST) {
        System.out.println("Game over. No more attempts.");
        System.out.println("The correct colors were: " + selectedColors);
    }
}

  private List<Color> getUserInput() {
    List<Color> userColors = new ArrayList<>();
    System.out.println("Enter 6 colors (space-separated):");
    String input = scanner.nextLine().toUpperCase();
    String[] colorStrings = input.split("\\s+");

    for (String colorString : colorStrings) {
      try {
        Color color = Color.valueOf(colorString);
        userColors.add(color);
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid color: " + colorString + ". Please try again.");
        return getUserInput();
      }
    }

    if (userColors.size() != 6) {
      System.out.println("Please enter exactly 6 colors.");
      return getUserInput();
    }

    return userColors;
  }

  private void displayResult(Tuple result) {
    System.out.println("Attempt " + result.attempt + ":");
    System.out.println("Exact matches: " + result.responseFromGuess.get(Match.EXACT));
    System.out.println("Partial matches: " + result.responseFromGuess.get(Match.PARTIAL));
    System.out.println("No matches: " + result.responseFromGuess.get(Match.NOMATCH));
    System.out.println();
  }
}

package colorgame;

import org.junit.jupiter.api.Test;
import java.util.*;
import static colorgame.Color.*;
import static colorgame.Match.*;
import static colorgame.Status.*;
import static colorgame.Game.*;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
  Game game = new Game(1);

  @Test
  void playForFirstAttemptWithExactMatch() {
    var selectedColors = List.of(RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE);
    var userColors = List.of(RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE);

    Tuple expected = new Tuple(1, WON, Map.of(EXACT, 6, PARTIAL, 0, NOMATCH, 0) );
    Tuple result = game.play(selectedColors, userColors, 20);

    assertTrue(result.equals(expected));
  }

  @Test
  void playForFirstAttemptWithNoMatch() {
    var selectedColors = List.of(RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE);
    var userColors = List.of(WHITE, CYAN, VIOLET, MOCHA, WHITE, CYAN);

    Tuple result = game.play(selectedColors, userColors, 20);
    Tuple expected = new Tuple(2, IN_PROGRESS, Map.of(EXACT, 0, PARTIAL, 0, NOMATCH, 6) );

    assertTrue((result.attempt == expected.attempt) && (result.status.equals(expected.status)));
  }

  @Test
  void playForFinalAttemptWithoutExactMatch(){
    var selectedColors = List.of(RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE);
    var userColors = List.of(WHITE, CYAN, VIOLET, MOCHA, WHITE, CYAN);
    Tuple result = new Tuple(game.attempt, IN_PROGRESS, Map.of(EXACT, 0, PARTIAL, 0, NOMATCH, 6));

    for(int i = 0; i < 20; i++){
      result = game.play(selectedColors, userColors, 20);
    }

    Tuple expected = new Tuple(20, LOST, Map.of(EXACT, 0, PARTIAL, 0, NOMATCH, 6));
    
    assertTrue(expected.status == result.status);
  }
}

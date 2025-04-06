import sys

from file_reader import read_words
from word_selector import select_word
from scramble_word import scramble_word
from calculate_score import calculate_score

def main():
  if len(sys.argv) != 2:
    print("Use: python src/consoleUI.py input.txt")
    sys.exit(1)

  file_path = sys.argv[1]

  words = read_words(file_path)
  if not words:
    print("Error: No words available to play!")
    sys.exit(1)

  word = select_word(words)
  scrambled = scramble_word(word)

  print(f"\nScrambled word: {scrambled}")

  while True:
    guess = input("Guess the word: (or type 'quit' to exit): ").strip().lower()

    if guess == 'quit':
      print("Thanks for playing!")
      break

    if not guess:
      print("Please enter a guess")
      continue

    score = calculate_score(guess, word)

    if guess == word.lower():
      print("Correct! You won!")
      break
    else:
      print(f"Score for this guess: {score}")

if __name__ == "__main__":
  main()
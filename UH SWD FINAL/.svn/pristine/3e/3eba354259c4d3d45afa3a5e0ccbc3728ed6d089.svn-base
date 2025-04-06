def calculate_score(guess, target_word):
  if len(guess) != len(target_word):
    return 1

  vowels = set('aeiou')
  score = 0
  used = set()

  for letter in guess.lower():
    if letter in target_word.lower() and letter not in used:
      score += 1 if letter in vowels else 2
      used.add(letter)

  return score

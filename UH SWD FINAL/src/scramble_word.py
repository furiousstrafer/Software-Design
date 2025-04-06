import random

def scramble_word(word):
  if len(word) <= 1:
    return word

  result = word
  while result == word:
    chars = list(word)
    random.shuffle(chars)
    result = ''.join(chars)

  return result

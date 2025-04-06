import unittest

from src.scramble_word import scramble_word

class TestScrambleWords(unittest.TestCase):
  def test_scramble_empty_word(self):
    self.assertEqual(scramble_word(""), "")

  def test_scramble_single_letter_word(self):
    self.assertEqual(scramble_word("a"), "a")

  def test_scramble_two_letter_word(self):
    self.assertNotEqual(scramble_word("ab"), "ab")

  def test_scramble_three_letter_word(self):
    self.assertNotEqual(scramble_word("abc"), "abc")

  def test_scramble_monkey(self):
    self.assertNotEqual(scramble_word("monkey"), "monkey")

if __name__ == '__main__':
  unittest.main()

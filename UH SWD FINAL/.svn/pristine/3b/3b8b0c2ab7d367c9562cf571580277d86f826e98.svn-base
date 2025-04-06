import unittest

from src.word_selector import select_word

class TestWordSelector(unittest.TestCase):
  def test_select_from_empty_list(self):
    self.assertEqual(select_word([]), "")

  def test_select_from_single_word(self):
    self.assertEqual(select_word(["monkey"]), "monkey")

  def test_select_from_word_list(self):
    words = ["monkey", "fruit", "banana", "apple", "cosmopolitan"]

    self.assertIn(select_word(words), words)

if __name__ == '__main__':
  unittest.main()

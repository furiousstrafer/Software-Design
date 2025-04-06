import unittest
import os

from src.file_reader import read_words

class TestFileReader(unittest.TestCase):
  def test_read_words_from_input_file(self):
    current_dir = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
    input_file = os.path.join(current_dir, "input.txt")

    expected_words = [
      "monkey",
      "fruit",
      "banana",
      "apple",
      "cosmopolitan"
    ]

    self.assertEqual(read_words(input_file), expected_words)

if __name__ == '__main__':
  unittest.main()

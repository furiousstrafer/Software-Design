import unittest

from src.process_text import process_text

class TestProcessWords(unittest.TestCase):
  def test_canary(self):
    self.assertTrue(True)

  def test_empty_text(self):
    self.assertEqual(process_text(""), "")

  def test_process_text_single_word(self):
    self.assertEqual(process_text("monkey"), "monkey")

if __name__ == '__main__':
  unittest.main()

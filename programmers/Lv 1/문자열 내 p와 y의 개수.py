import unittest


class TestCase(unittest.TestCase):

    @staticmethod
    def solution(s):
        return s.lower().count('p') == s.lower().count('y')

    def testcase(self):
        self.assertEqual(self.solution("pPoooyY"), True)
        self.assertEqual(self.solution("Pyy"), False)


if __name__ == '__main__':
    unittest.main()

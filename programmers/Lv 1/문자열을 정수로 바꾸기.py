import unittest


class TestCase(unittest.TestCase):

    @staticmethod
    def solution(s):
        return int(s)

    def testcase(self):
        self.assertEqual(self.solution("1234"), 1234)
        self.assertEqual(self.solution("-1234"), -1234)


if __name__ == '__main__':
    unittest.main()
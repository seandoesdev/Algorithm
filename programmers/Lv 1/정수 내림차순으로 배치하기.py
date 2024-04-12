import unittest


class TestCase(unittest.TestCase):

    @staticmethod
    def solution(n):
        return int(''.join(sorted([i for i in str(n)], reverse=True)))

    def testcase(self):
        self.assertEqual(self.solution(118372), 873211)


if __name__ == '__main__':
    unittest.main()

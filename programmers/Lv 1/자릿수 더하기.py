import unittest


class TestCase(unittest.TestCase):

    @staticmethod
    def solution(n):
        return list(map(int, reversed(str(n))))

    def testcase(self):
        self.assertEqual(self.solution(12345), [5,4,3,2,1])
        self.assertEqual(self.solution(987), [7,8,9])


if __name__ == '__main__':
    unittest.main()

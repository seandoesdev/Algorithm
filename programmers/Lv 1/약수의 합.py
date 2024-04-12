import unittest


class TestCase(unittest.TestCase):

    @staticmethod
    def solution(n):
        answer = 0

        for i in range(1, n + 1):
            if n % i == 0:
                answer += i

        return answer

    @staticmethod
    def solution2(n):
        return sum([i for i in range(1, n+1) if (not n % i)])

    def testcase(self):
        self.assertEqual(self.solution(12), 28)
        self.assertEqual(self.solution(5), 6)
        self.assertEqual(self.solution2(12), 28)
        self.assertEqual(self.solution2(5), 6)


if __name__ == '__main__':
    unittest.main()
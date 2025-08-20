class Solution {
    public int solution(int n) {
        int targetCount = Integer.bitCount(n);
        int next = n + 1;

        while (Integer.bitCount(next) != targetCount) {
            next++;
        }

        return next;
    }
}
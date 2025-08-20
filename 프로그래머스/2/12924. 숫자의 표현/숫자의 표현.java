class Solution {
    public int solution(int n) {
        int count = 0;
        int start = 1, end = 1, sum = 1;

        while (start <= n / 2) {
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else {
                count++;
                end++;
                sum += end;
            }
        }

        return count + 1;
    }
}
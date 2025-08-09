class Solution {
    public int solution(int n) {
        int last  = (n % 2 == 0) ? n : n - 1;
        int count = last / 2;
        return (count * (2 + last)) / 2;
    }
}
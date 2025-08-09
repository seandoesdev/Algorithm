class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int nextEmptyBottles = n / a * b;
            answer += nextEmptyBottles;
            n = n % a + nextEmptyBottles;
        }
        return answer;
    }
}
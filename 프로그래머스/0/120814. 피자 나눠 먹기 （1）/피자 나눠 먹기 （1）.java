class Solution {
    public int solution(int n) {
        if(n == 1){
            return 1;
        }else if(n % 7 != 0){
            return (n / 7) + 1;
        }else{
            return n / 7;
        }
        
    }
}
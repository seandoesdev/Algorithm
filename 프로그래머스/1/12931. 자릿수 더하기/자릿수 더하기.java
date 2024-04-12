import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");
        
        for(String arr : array){
            answer += Integer.parseInt(arr);
        }
        
        return answer;
    }
}
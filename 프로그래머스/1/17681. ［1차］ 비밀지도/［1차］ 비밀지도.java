import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for(int i=0; i<n; i++){
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            String padded = String.format("%" + n + "s", binary);
            result[i] = padded.replace("0", " ").replace("1", "#");
        }

        return result;
    }
}
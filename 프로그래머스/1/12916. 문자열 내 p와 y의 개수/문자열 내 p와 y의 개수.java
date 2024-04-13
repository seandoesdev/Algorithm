class Solution {
    boolean solution(String s) {
        int pCount = 0, yCount = 0;
        String[] array = s.toLowerCase().split("");
        
        for(String arr : array){
            if (arr.equals("p"))
                pCount++;
            if (arr.equals("y"))
                yCount++;
                
        }
        
        if (pCount == yCount)
            return true;

        return false;
    }
}
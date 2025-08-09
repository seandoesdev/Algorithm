import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<StringBuilder> list = new ArrayList<>();

        for(String s: strings){
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(n)).append(s);
            list.add(sb);
        }

        Collections.sort(list);

        String[] answer = new String[strings.length];
        for(int i=0; i<strings.length; i++){
            answer[i] = list.get(i).toString().substring(1);
        }
        
        return answer;
    }
}
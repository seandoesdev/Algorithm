import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void process(String a, String b) {
        int a_num = Integer.parseInt(a);
        int b_num = Integer.parseInt(b);
        List<Integer> b_list = toList(b);
        for(int i=b_list.size(); i>0; i--){
            System.out.print(b_list.get(i-1) * a_num + "\n");
        }
        System.out.println(a_num * b_num);
    }

    // 문자열 처리
    public static List<Integer> toList(String numStr){
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<numStr.length(); i++){
            list.add(numStr.charAt(i) - '0');
        }
        return list;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        process(br.readLine(), br.readLine());
    }

}

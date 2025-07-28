import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void process(String a, String b) {

        int a_num = Integer.parseInt(a);
        int b_num = Integer.parseInt(b);
        List<Integer> b_list = b.chars()
                                .map(c-> c-'0')
                                .boxed()
                                .collect(Collectors.toList());

        for(int i=b_list.size(); i>0; i--){
            System.out.println(a_num * b_list.get(i-1));
        }

        System.out.println(a_num * b_num);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        process(a, b);
    }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
 
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int X = Integer.parseInt(str[1]);
        String a = br.readLine();
        List<Integer> result = new ArrayList<>();

        for(String c : a.split(" ")){
            if(Integer.parseInt(c) < X){
                System.out.print(c + " ");
            }
        }

    }

}

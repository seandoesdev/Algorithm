import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for(String c : str.split(" ")) {
            if(Integer.parseInt(c) == v){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
    
}

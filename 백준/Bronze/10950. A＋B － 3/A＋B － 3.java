import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++)
        {
            String string = br.readLine();
            int a = Integer.parseInt(string.split(" ")[0]);
            int b = Integer.parseInt(string.split(" ")[1]);

            System.out.println(a+b);
        }
    }

}
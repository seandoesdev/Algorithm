import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total_price = Integer.parseInt(br.readLine());
        int item_cnt = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<item_cnt; i++){
            String item = br.readLine();
            int price = Integer.parseInt(item.split(" ")[0]);
            int cnt = Integer.parseInt(item.split(" ")[1]);
            sum += price * cnt;
        }

        if(sum == total_price){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
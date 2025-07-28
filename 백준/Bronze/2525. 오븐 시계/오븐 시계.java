import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String time = br.readLine();
        
        int hour = Integer.parseInt(time.split(" ")[0]);
        int min = Integer.parseInt(time.split(" ")[1]);
        int cookingTime = Integer.parseInt(br.readLine());

        if(min + cookingTime >= 60){
            hour += (min + cookingTime) / 60;
            min = (min + cookingTime) % 60;
        }else{
            min += cookingTime;
        }
        if(hour >= 24){
            hour = hour % 24;
        }
        System.out.println(hour + " " + min);
    }
}

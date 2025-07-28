import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        if(min + time >= 60){
            hour += (min + time) / 60;
            min = (min + time) % 60;
        }else{
            min += time;
        }
        if(hour >= 24){
            hour = hour % 24;
        }
        System.out.println(hour + " " + min);
    }
}

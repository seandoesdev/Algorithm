import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] twoNumArr = br.readLine().split(" ");
        int firstNum = Integer.parseInt(new StringBuilder(twoNumArr[0]).reverse().toString());
        int secondNum = Integer.parseInt(new StringBuilder(twoNumArr[1]).reverse().toString());

        if(firstNum > secondNum){
            System.out.println(firstNum);
        }else{
            System.out.println(secondNum);
        }
        
    }

}

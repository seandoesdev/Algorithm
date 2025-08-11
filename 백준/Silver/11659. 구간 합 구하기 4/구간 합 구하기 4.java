import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 구간 합
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " " );

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[n];
        for(int i=0; i<n; i++){
            if(i == 0){
                sum[i] = arr[i];
            }
            else{
                sum[i] = sum[i-1] + arr[i];
            }
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 1){
                System.out.println(sum[b-1]);
            }
            else{
                System.out.println(sum[b-1] - sum[a-2]);
            }
        }
        br.close();
    }

}

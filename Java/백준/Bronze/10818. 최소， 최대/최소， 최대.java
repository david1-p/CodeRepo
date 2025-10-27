import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(st.nextToken());

            min = Math.min(min, currentNum);
            max = Math.max(max, currentNum);
        }
        
        System.out.println(min + " " + max);
    }
}
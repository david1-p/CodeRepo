import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. N, M 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 2. 바구니 배열 생성 
        int[] baskets = new int[N + 1];

        // 3. 바구니 초기화 (i번 바구니에 i번 공)
        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }

        // 4. M번 반복
        for (int k = 0; k < M; k++) {
            // 5. 교환할 두 바구니 i, j 입력
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            
            // 6. i번 바구니와 j번 바구니의 공을 교환
            int temp = baskets[i];    
            baskets[i] = baskets[j];  
            baskets[j] = temp;        
        }
        
        scanner.close();

        // 7. 1번부터 N번 바구니까지 결과 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
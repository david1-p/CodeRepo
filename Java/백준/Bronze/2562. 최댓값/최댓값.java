import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxValue = 0;   
        int maxIndex = 0; 
        
        // 1. 1번째부터 9번째까지 9번 반복
        for (int i = 1; i <= 9; i++) {

            int num = scanner.nextInt();
            

            if (num > maxValue) {
                maxValue = num;
                maxIndex = i; // 최댓값의 위치를 현재 'i'번째로 저장
            }
        }
        
        // 4. 결과 출력
        System.out.println(maxValue);
        System.out.println(maxIndex);
        
        scanner.close();
    }
}
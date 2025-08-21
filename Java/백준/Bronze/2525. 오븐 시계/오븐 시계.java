import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int C = scanner.nextInt();
        
        scanner.close();
        
        // 1. 현재 분과 요리 시간을 더해서 총 분을 계산한ㄷ. 
        int totalMinutes = B + C;
        
        // 2. 총 분을 60으로 나눈 몫은 시간에 더해주고, 나머지는 최종 분으로 남긴다. 
        int hoursToAdd = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;
        
        // 3. 현재 시에 추가될 시간을 더해서 최종 시 계산 
        int finalHours = A + hoursToAdd;
        
        // 4. 만약에 최종 시가 24가 넘어가면 24로 나눈 나머지를 시간으로 보정
        finalHours = finalHours % 24;
        
        // 최종 연산
        System.out.println(finalHours + " " + finalMinutes);
    }
}
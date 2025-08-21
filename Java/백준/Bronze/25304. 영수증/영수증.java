import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int N = scanner.nextInt();

        int calculatedSum = 0;

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            calculatedSum += (a * b);
        }

        scanner.close();

        if (X == calculatedSum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

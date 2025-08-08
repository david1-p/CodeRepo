import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        
        scanner.close();
        
        long sum = a + b + c;
        
        System.out.println(sum);
    }
}
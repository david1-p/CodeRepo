import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        scanner.close();
        
        int longCount = N / 4;
        
        for (int i = 0; i < longCount; i++) {
            System.out.print("long ");
        }
        
        System.out.println("int");
    }
}
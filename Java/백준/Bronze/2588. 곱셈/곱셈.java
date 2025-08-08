import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        scanner.close();

        int result3 = num1 * (num2 % 10);
        int result4 = num1 * ((num2 / 10) % 10);
        int result5 = num1 * (num2 / 100);
        int result6 = num1 * num2;

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}

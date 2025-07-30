import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("\nBitwise Operations:");
        System.out.printf("%d & %d = %d (Binary: %s)\n", a, b, (a & b), Integer.toBinaryString(a & b));
        System.out.printf("%d | %d = %d (Binary: %s)\n", a, b, (a | b), Integer.toBinaryString(a | b));
        System.out.printf("%d ^ %d = %d (Binary: %s)\n", a, b, (a ^ b), Integer.toBinaryString(a ^ b));
        System.out.printf("%d << %d = %d (Binary: %s)\n", a, b, (a << b), Integer.toBinaryString(a << b));
        System.out.printf("%d >> %d = %d (Binary: %s)\n", a, b, (a >> b), Integer.toBinaryString(a >> b));

        sc.close();
    }
}
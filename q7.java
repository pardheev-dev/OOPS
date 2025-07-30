import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double average = (a + b + c) / 3;
        double wrongAverage = a + b + c / 3;

        System.out.println("Average using (a + b + c) / 3: " + average);
        System.out.println("Average using a + b + c / 3: " + wrongAverage);

        System.out.println("\nAnalysis:");
        System.out.println("In 'a + b + c / 3', division has higher precedence, so it is evaluated as a + b + (c / 3).");
        System.out.println("To get the correct average, use parentheses: (a + b + c) / 3.");

        sc.close();
    }
}
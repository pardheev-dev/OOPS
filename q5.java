import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch; 

        System.out.println("Character entered: " + ch);
        System.out.println("ASCII value: " + ascii);

        sc.close();
    }
}
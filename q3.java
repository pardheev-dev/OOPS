public class q3 {
    public static void main(String[] args) {
        int num = 12345;
        long longNum = num;      // Widening from int to long
        float floatNum = longNum; // Widening from long to float

        System.out.println("Original int value: " + num);
        System.out.println("After widening to long: " + longNum);
        System.out.println("After widening to float: " + floatNum);
    }
}
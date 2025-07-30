public class q6 {
    public static void main(String[] args) {
        int expr1 = 10 + 2 * 5;         
        int expr2 = (10 + 2) * 5;       
        int expr3 = 100 / 5 + 2 * 3 - 4;

        System.out.println("10 + 2 * 5 = " + expr1);      
        System.out.println("(10 + 2) * 5 = " + expr2);   
        System.out.println("100 / 5 + 2 * 3 - 4 = " + expr3); 

        System.out.println("\nExplanation:->For the expressions:");
        System.out.println("1. 10 + 2 * 5: '*' has higher precedence, so 2*5=10, then 10+10=20.");
        System.out.println("2. (10 + 2) * 5: Parentheses first, 10+2=12, then 12*5=60.");
        System.out.println("3. 100 / 5 + 2 * 3 - 4: '/' and '*' before '+', '-', so 100/5=20, 2*3=6, then 20+6=26, 26-4=22.");
    }
}
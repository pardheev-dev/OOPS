import java.util.*;

public class Studentnamemanagement {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Amit");
        students.add("Raj");
        students.add("Priya");
        students.add(1, "Neha");
        students.remove("Raj");
        boolean hasPriya = students.contains("Priya");
        int total = students.size();
        for(String s : students) {
            System.out.println(s);
        }
        System.out.println(hasPriya);
        System.out.println(total);
    }
}

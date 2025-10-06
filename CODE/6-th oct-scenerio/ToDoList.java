import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> todos = new ArrayList<>();
        todos.add("Complete assignment");
        todos.add("Buy groceries");
        todos.add("Call John");
        todos.remove("Buy groceries");
        String first = todos.get(0);
        Collections.sort(todos);
        boolean empty = todos.isEmpty();
        for(String t : todos) {
            System.out.println(t);
        }
        System.out.println(first);
        System.out.println(empty);
    }
}

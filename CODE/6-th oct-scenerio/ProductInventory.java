import java.util.*;

public class ProductInventory {
    public static void main(String[] args) {
        ArrayList<Integer> quantities = new ArrayList<>();
        quantities.add(10);
        quantities.add(5);
        quantities.add(15);
        quantities.set(1, 12);
        int sum = 0;
        for(int q : quantities) {
            sum += q;
        }
        System.out.println(sum);
        quantities.clear();
        System.out.println(quantities.size());
    }
}

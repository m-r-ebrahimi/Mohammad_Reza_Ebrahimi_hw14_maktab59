package q3;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(1);
        nums.stream()
                .filter(value -> value>1)
                .forEach(System.out::println);
    }
}

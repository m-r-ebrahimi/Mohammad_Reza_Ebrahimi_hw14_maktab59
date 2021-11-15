package q4;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.stream.Collectors.groupingBy;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Amir");
        strings.add("Hatef");
        strings.add("Mehran");
        strings.add("Mojtaba");
        strings.add("Mohammad");
        strings.add("Ali");
        strings.add("Davood");
        strings.add("Reza");
        strings.add("Mohsen");

        // first
        strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        System.out.println();

        // second
        System.out.println(strings.stream().collect(groupingBy(String::length)));
    }
}

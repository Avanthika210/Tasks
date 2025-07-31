import java.util.*;
import java.util.stream.*;

public class DuplicateFinder {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        Set<String> seen = new HashSet<>();

        List<String> duplicates = list.stream()
            .filter(e -> !seen.add(e)) 
            .distinct()               
            .collect(Collectors.toList());

        System.out.println("Duplicates: " + duplicates);
    }
}

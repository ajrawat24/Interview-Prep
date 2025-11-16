package CollectionsProgrames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStrings {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("banana");
        list.add("apple");
        list.add("orange");

        Collections.reverse(list);

        System.out.println("Reversed Sorted List: " + list);
    }
}

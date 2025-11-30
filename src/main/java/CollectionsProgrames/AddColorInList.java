package CollectionsProgrames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddColorInList {
    public static void main(String[] str) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);
        Collections.swap(colors, 1, 3);  // Swap elements at index 1 and 3
        System.out.println(colors);


    }
}

package CollectionsProgrames;

import java.util.*;

public class RemoveSecondHighestValueMap {
    public static void main(String[] args) {
        // Step 1: Create and populate the HashMap
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 20);
        map.put(2, 50);
        map.put(3, 40);
        map.put(4, 70);
        map.put(5, 60);

        System.out.println("Original Map: " + map);

        // Step 2: Extract all values into a list
        List<Integer> values = new ArrayList<>(map.values());

        // Step 3: Sort values in descending order
        Collections.sort(values, Collections.reverseOrder());

        // Step 4: Find the second highest value
        int secondHighest = values.get(1);
        System.out.println("Second highest value: " + secondHighest);

        // Step 5: Find key(s) with that value and remove it/them
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() == secondHighest) {
                iterator.remove();
            }
        }

        System.out.println("Map after removing second highest value: " + map);
    }
}
/* Logic
1. Create hash map with key values
2. Store these values to List
3. reverse the order of values
4. GetValue from the values List (by index) 0, 1 so get the 1 position value
5. now we have the highest value
6. Iterate the map
7. put map into iteration
8. get value is second higest remove this.

 */
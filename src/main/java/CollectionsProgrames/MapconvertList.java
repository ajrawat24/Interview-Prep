package CollectionsProgrames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapconvertList {

    public static void main(String[] args) {


                Map<String, Integer> map = new HashMap<>();
                map.put("Ajay", 50);
                map.put("Rahul", 20);
                map.put("Neha", 70);

                List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
                list.sort(Map.Entry.comparingByValue());

                System.out.println(list);
            }
        }



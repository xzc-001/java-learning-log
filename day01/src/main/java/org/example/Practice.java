import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("pear");
        System.out.println(list.get(0));   // apple
        System.out.println(list.size());   // 3

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("apple", 3);
        System.out.println(map.get("apple"));             // 3
        System.out.println(map.getOrDefault("banana", 0)); // 0

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
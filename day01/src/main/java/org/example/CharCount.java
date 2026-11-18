import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String s = "hello world";
        Map<Character, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            // TODO 1：把 c 的出现次数记进 count（提示：getOrDefault + 1）
            count.put(c, count.getOrDefault(c,0)+1);
        }

        // TODO 2：遍历 count，按 "字符 = 次数" 打印（提示：entrySet）
        for(Map.Entry<Character,Integer> entry : count.entrySet()){
            System.out.println(entry.getKey() +  "=" + entry.getValue());
        }
    }
}
public class HashDemo {
    public static void main(String[] args) {
        String[] keys = {"apple", "banana", "pear", "hello", "world", "java", "spring", "mysql"};
        for (String k : keys) {
            int h = k.hashCode();
            int hash = h ^ (h >>> 16);
            System.out.println(k + "  hash=" + hash
                    + "  idx16=" + (hash & 15)
                    + "  mod16=" + (hash % 16));
        }
    }
}
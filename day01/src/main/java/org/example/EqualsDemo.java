package org.example;

import java.util.HashSet;
import java.util.Set;

public class EqualsDemo {
    public static void main(String[] args) {
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b);        // false
        System.out.println(a.equals(b));   // true

        Set<User> set = new HashSet<>();
        set.add(new User("tom", 20));
        System.out.println(set.contains(new User("tom", 20)));  // true
    }
}
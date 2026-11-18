package org.example;

import java.util.Objects;

public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                        // 1. 同一引用，直接 true
        if (o == null || getClass() != o.getClass()) return false;  // 2. 类型不对，false
        User u = (User) o;                                 // 3. 强转后逐字段比
        return age == u.age && Objects.equals(name, u.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
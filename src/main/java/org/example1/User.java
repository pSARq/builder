package org.example1;

public class User {

    private final String name;
    private final String lastName;
    private final int age;
    private final float height;

    public User(String name, String lastName, int age, float height) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

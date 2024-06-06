package org.example1;

public class UserBuilderImpl implements UserBuilder {

    private String name;
    private String lastName;
    private int age;
    private float height;

    @Override
    public UserBuilderImpl name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilderImpl lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserBuilderImpl age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public UserBuilderImpl height(float height) {
        this.height = height;
        return this;
    }

    @Override
    public User build() {
        return new User(name, lastName, age, height);
    }
}

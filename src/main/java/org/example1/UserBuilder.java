package org.example1;

public interface UserBuilder {
    UserBuilderImpl name(String name);
    UserBuilderImpl lastName(String lastName);
    UserBuilderImpl age(int age);
    UserBuilderImpl height(float height);
    User build();
}

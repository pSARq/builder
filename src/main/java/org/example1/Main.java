package org.example1;

public class Main {
    public static void main(String[] args) {
        /*He visto varias formas de hacerlo, pero esta es la que se me parece que es la mas común y tambien tiene mucha
         similitud con la que aparece en refactoring guru*/
        UserBuilder builder = new UserBuilderImpl();
        User user1 = builder
                .name("Nombre usuario 1")
                .lastName("Apellido usuario 1")
                .build();

        User user2 = builder
                .name("Nombre usuario 2")
                .lastName("Apellido usuario 2")
                .age(10)
                .height(1.50f)
                .build();

        System.out.println("Usuario 1 = " + user1);
        System.out.println("Usuario 2 = " + user2);
    }
}
package ua.javarush.module3.lesson16;

public class Example8 {
    public static void main(String[] args) {
//        new User("Alex" ,"Shevchenko","alex.shevchenko@gmail.com")

        User user = User.builder()
                .withSurname("Alec")
                .withName("Alex")
                .withEmail("exampl@gmail.com")
                .build();
    }
}


class User {
    private final String name;
    private final String surname;
    private final String email;

    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String surname;
        private String email;

        private Builder(){

        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}

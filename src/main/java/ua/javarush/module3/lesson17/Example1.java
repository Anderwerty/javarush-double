package ua.javarush.module3.lesson17;

public class Example1 {
    public static void main(String[] args) {
        User polina = User.builder()
                .withName("Polina")
                .withAge(10)
                .build();

        Student alex = Student.builder()
                .withName("Alex")
                .withAge(12)
                .withNumber(100)
                .build();
    }
}

class User {
    private final String name;

    private final int age;

    protected User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder<SELF extends UserBuilder<SELF>> {
        private String name;
        private int age;

        protected UserBuilder(){

        }

        protected SELF self(){
            return (SELF) this;
        }

        public SELF withName(String name) {
            this.name = name;
            return self();
        }

        public SELF withAge(int age) {
            this.age = age;
            return self();
        }

        public User build() {
            return new User(this);
        }
    }


}

class Student extends User {

    private final int number;

    protected Student(StudentBuilder builder) {
        super(builder);
        this.number = builder.number;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }



    public static class StudentBuilder extends User.UserBuilder<StudentBuilder> {
        private int number;


        @Override
        protected StudentBuilder self() {
            return this;
        }

        public StudentBuilder withNumber(int number) {
            this.number = number;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}

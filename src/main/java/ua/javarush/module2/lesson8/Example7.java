package ua.javarush.module2.lesson8;

import java.util.Objects;

public class Example7 {
    public static void main(String[] args) {
        VipClient alex = new VipClient("Alex", 20);
        VipClient2 alex1 = new VipClient2("Alex", 20);
        VipClient2 alex2 = new VipClient2("Alex", 20);
        System.out.println(alex1);
        System.out.println(alex1.equals(alex2));

        System.out.println(alex1.getClass().getSuperclass().getName());
    }
}

final class VipClient {
    private final String name;
    private final int age;

    VipClient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VipClient vipClient = (VipClient) o;
        return Objects.equals(name, vipClient.name) &&
                Objects.equals(age, vipClient.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

record VipClient2(String name, int age) implements MyInterface {
  public void method(){

  }
}

interface MyInterface{

}

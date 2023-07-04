package ua.javarush.module1.lesson15.example2;

public class Example2 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.setB(b);
        b.setA(a);
    }
}

class A{
    private B b;

    public A() {
    }

    public void setB(B b){
        this.b = b;
    }
}

class B{
    private A a;

    public B() {
    }

    public void setA(A a) {
        this.a = a;
    }
}

package ua.javarush.module2.lesson5;

public class Example6 {

    public static void main(String[] args) {
        AClass<String> myclass = new AClass<>();

        AClass.<Integer>method(1);

        myclass.<Integer>noStaticMethod(1);

        String string = myclass.getBean("string");

        Integer integerType = myclass.<Integer>getBean("int");

        String bean = myclass.getBean("String-1", String.class);
    }
}

class AClass<T> {

    T t;

    public <O> AClass(T t) {
        this.t = t;
    }

    public AClass(){

    }

    public static <E> void method(E t){

    }


    public <S> void noStaticMethod(S s){

    }


    public <B> B getBean(String name){
        return null;
    }

    public <B> B getBean(String name, Class<B> klass){
        return null;
    }


}

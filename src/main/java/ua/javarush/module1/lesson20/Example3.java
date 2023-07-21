package ua.javarush.module1.lesson20;

public class Example3 {

    public static void main(String[] args) {
//        Type type = new Type("...");

        System.out.println(Type.HARD.getDescription());
        System.out.println(Type.HARD.toString());

        Type.HARD.setDescription("......");

        System.out.println(Type.HARD.toString());


        Object o = new Object() {
            @Override
            public String toString() {
                return "$classname{......}";
            }
        };
        System.out.println(o.getClass());

        System.out.println(Type.HARD.getClass());
        System.out.println(Type.SIMPLE.getClass());
    }
}

enum Type {
    SIMPLE("very simple"){
        @Override
        public String toString() {
            return "$classname{" +
                    "description====='" + getDescription() + '\'' +
                    '}';
        }
    },
    HARD;

    private String description;

    Type(String description) {
        this.description = description;
    }

    Type(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name="+ name()+"\n"+
                "description='" + description + '\'' +
                '}';
    }
}

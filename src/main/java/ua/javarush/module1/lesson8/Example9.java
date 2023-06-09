package ua.javarush.module1.lesson8;

public class Example9 {
    public static void main(String[] args) {
        String[] lines = {"Hello", "Hello", "World", "Java", "Tasks", "World"};
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < lines.length; i++) {
//            lines[i] = scanner.next();// nextLine()?
//        }

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            boolean isDuplicate = false;
            for (int j = i; j < lines.length; j++) {
                if (i != j && line !=null && line.equals(lines[j])) {
                    lines[j] = null;
                    isDuplicate = true;
                }
            }
            if (isDuplicate) {
                lines[i] = null;
            }
        }

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i] + " ");
        }
    }
}

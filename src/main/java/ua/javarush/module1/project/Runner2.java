package ua.javarush.module1.project;

import java.util.ArrayList;
import java.util.List;

public class Runner2 {
    public static void main(String[] args) {
        System.out.println("..........");
        char[] symbols = {'a', 'b', '.', ','};
        char[] symbols2 = {'a', '0', '1'};

        //'a' ---> 'b' key 1
        //'A' -> 'a' --->'b' ->'B'

        CaesarCipher caesarCipher = new CaesarCipher(symbols);
        CaesarCipher caesarCipher2 = new CaesarCipher(symbols2);
        FileService fileService = new FileService();
        ConsoleViewProvider consoleViewProvider = new ConsoleViewProvider();


        if (args.length == 0) {

        } else {
            String command = args[0];
            String filename = args[1];
            int key = Integer.parseInt(args[2]);

            System.out.println(command);
            if(command =="ENCODE"){
                List<String> lines = fileService.read(filename);

                ArrayList<String> strings = new ArrayList<>();

                for (String string : strings) {
                    lines.add(caesarCipher.encode(string, key));
                }

            }
        }
    }
}

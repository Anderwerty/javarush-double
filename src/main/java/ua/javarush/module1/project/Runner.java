package ua.javarush.module1.project;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        char[] symbols = {'a', 'b', 'A', 'B', '.', ','};
        char[] symbols2 = {'a', '0', '1'};

        //'a' ---> 'b' key 1
        //'A' -> 'a' --->'b' ->'B'

        CaesarCipher caesarCipher = new CaesarCipher(symbols);
        CaesarCipher caesarCipher2 = new CaesarCipher(symbols2);
        FileService fileService = new FileService();
        ConsoleViewProvider consoleViewProvider = new ConsoleViewProvider();


        consoleViewProvider.print("input file path");
        String filename = consoleViewProvider.read(); // next vs nextLine ?

        consoleViewProvider.print("input key");
        int key = consoleViewProvider.readInt();

        List<String> lines = fileService.read(filename);

        ArrayList<String> strings = new ArrayList<>();

        for (String string : strings) {
            lines.add(caesarCipher.encode(string, key));
        }
        consoleViewProvider.print("input file path to save");
        String filenameToSave = consoleViewProvider.read();

        fileService.write(filenameToSave, lines);

    }
}

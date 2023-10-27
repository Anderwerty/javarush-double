package ua.javarush.module2.project.example2;

import ua.javarush.module2.project.example2.domain.Island;
import ua.javarush.module2.project.example2.service.ConsoleViewProvider;

public class IslandApplication {
    public static void main(String[] args) {
        ConsoleViewProvider consoleViewProvider = new ConsoleViewProvider();
        consoleViewProvider.printMessage("input island size");
        consoleViewProvider.printMessage("sizeX");
        int sizeX = consoleViewProvider.readInt();
        consoleViewProvider.printMessage("sizeY");
        int sizeY = consoleViewProvider.readInt();

        new Island(sizeX, sizeY).live();
    }
}

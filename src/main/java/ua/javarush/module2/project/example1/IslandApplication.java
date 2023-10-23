package ua.javarush.module2.project.example1;

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

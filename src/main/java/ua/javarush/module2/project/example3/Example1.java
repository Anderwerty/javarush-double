package ua.javarush.module2.project.example3;

public class Example1 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setCurrentLogLevel(LogLevel.ERROR);
//        LogLevel debug = LogLevel.valueOf("DEBUG");

        logger.info("Info");
        logger.debug("Debug");
        logger.error("error");
    }
}

// config log.level = DEBUG

class Logger {
    private LogLevel currentLogLevel;

    public void setCurrentLogLevel(LogLevel currentLogLevel) {
        this.currentLogLevel = currentLogLevel;
    }

    public void info(String message) {
        if (shouldPrint(LogLevel.INFO)) {
            System.out.println(message);
        }
    }

    public void debug(String message) {
        if (shouldPrint(LogLevel.DEBUG)) {
            System.out.println(message);
        }
    }

    public void error(String message) {
        if (shouldPrint(LogLevel.ERROR)) {
            System.out.println(message);
        }
    }

    private boolean shouldPrint(LogLevel logLevel) {
        return currentLogLevel.ordinal() <= logLevel.ordinal();
    }
}

enum LogLevel {
    INFO, DEBUG, ERROR


}

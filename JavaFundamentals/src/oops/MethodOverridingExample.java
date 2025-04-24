package oops;

import org.w3c.dom.ls.LSOutput;

class Logger{
    // Can not overide static, final and private methods
    void log(String message){
        System.out.println("Generic logger: " + message);
    }
}

// Specialized logger that overrides log method
class FileLogger extends Logger{
    @Override
    void log(String message){
        System.out.println("File logger: " + message);
    }
}

// Another specialized logger
class DatabaseLogger extends Logger{
    @Override
    void log(String message){
        System.out.println("Database logger: " + message);
    }
}


public class MethodOverridingExample {
    public static void main(String[] args) {

        Logger logger = new Logger();
        logger.log("System started.");

        FileLogger fileLogger = new FileLogger();
        fileLogger.log("User logged in.");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("User data updtated.");

    }
}

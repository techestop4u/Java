package future;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class AppLogger {


    private static Logger appLogger = Logger.getLogger(AppLogger.class.getName());

    public static Logger initializeLogger(){
        try {
            LogManager.getLogManager().readConfiguration(
                    new FileInputStream(
                            "src/logging.properties"));
            ConsoleHandler consoleHandler = new ConsoleHandler();
            appLogger.addHandler(consoleHandler);
            appLogger.setLevel(Level.INFO);
        } catch (IOException e) {
            System.out.println("Execption occurred: "+e.getMessage());
        }

        return appLogger;
    }
}

package com.tinochan.log4j2.log4j2;

//The required import for log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Console {
    // Define a static logger variable so that it references the
    // Logger instance named "Console".
    private static final Logger logger = LogManager.getLogger(Console.class);
 
    public static void main(final String... args) {
 
        // Set up a simple configuration that logs on the console as 
    	// we haven't created a configuration file yet.
    	// By default Log4j assigns the root logger to Level.ERROE.
    	// So the two trace messages will not be logged.
        logger.trace("Entering application.");
        logger.error("Error happened!");
        logger.trace("Exiting application.");
    }
}

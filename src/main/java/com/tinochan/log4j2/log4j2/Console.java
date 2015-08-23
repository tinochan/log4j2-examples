package com.tinochan.log4j2.log4j2;

//The required import for log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Console {
    // Define a static logger variable so that it references the
    // Logger instance named "Console".
    private static final Logger logger = LogManager.getLogger(Console.class);
 
    public static void main(final String... args) {
 
        // Only 1 log message with Level.ERROR will be logged
    	// after creating a configuration file and set
    	// the root logger level to Error.
        logger.trace("Entering application.");
        Console2 console2 = new Console2();
        if(console2.logIt()){
        	logger.error("Error happened!");
        }
        logger.trace("Exiting application.");
    }
}

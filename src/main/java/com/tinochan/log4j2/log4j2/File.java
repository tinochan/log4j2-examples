package com.tinochan.log4j2.log4j2;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class File {
	
	  private static final Logger logger = LogManager.getLogger("MyFileLogger");
	 
	  //The below messages will be logged in console
	  //and logged in file logs/app.log 
	  public boolean logIt() {
	    logger.entry();
	    logger.error("Logging...");
	    return logger.exit(true);
	  }
}

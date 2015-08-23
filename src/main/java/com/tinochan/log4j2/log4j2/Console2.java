package com.tinochan.log4j2.log4j2;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Console2 {
	  
	  private static final Logger logger = LogManager.getLogger(Console2.class.getName());
	 
	  //The below messages will be printed twice
	  //as the appender associated with logger com.tinochan.log4j2.log4j2.Console2
	  //which write the first instance. Then the parent which is the root logger
	  //is referenced, which then passed to its appender.
	  public boolean logIt() {
	    logger.entry();
	    logger.error("Logging...");
	    return logger.exit(true);
	  }
}

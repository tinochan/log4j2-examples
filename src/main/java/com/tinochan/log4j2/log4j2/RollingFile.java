package com.tinochan.log4j2.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RollingFile {

	private static final Logger logger = LogManager.getLogger("MyRollingFileLogger");
	 
	  //Try to create enough large amount of logs
	  public boolean logIt() {
		 for(int i=0; i<100 ; i++){
			logger.entry();
		    logger.error("Logging..."+i);
		 }
		 return logger.exit(true);
	  }
	  
	  public static void main(String[] args){
		  RollingFile rf = new RollingFile();
		  rf.logIt();
	  }
}

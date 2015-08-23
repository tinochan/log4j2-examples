package com.tinochan.log4j2.commonslogging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileDemo {

	private static Log logger = LogFactory.getLog("MyFileLogger");
	 
    public static void main(String[] args)
    {
		logger.debug("Test debug");
		logger.info("Test info");
		logger.error("Test error");
    }
    
}

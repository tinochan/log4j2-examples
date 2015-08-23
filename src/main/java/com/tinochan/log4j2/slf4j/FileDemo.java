package com.tinochan.log4j2.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileDemo {
	
	private static final Logger logger = LoggerFactory.getLogger("MyFileLogger");

	public static void main(String[] args) {
	    
	    logger.debug("Test debug");
		logger.info("Test info");
		logger.error("Test error");
	}

}

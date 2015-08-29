/**
* <h1>Slf4j console demo</h1>
* Slf4j is an abstraction for various logging frameworks like commons-logging.
* Developer can simply plug in a specific logging implementation in the
* configuration file without touching in the code level.
* <p>
* The logging implementation that will be used depends on the jar you have included.
* e.g. includes slf4j-api and log4j-slf4j-impl for working with log4j2.
* 
*
* @author  Tino Chan
* @version 1.0
* @since   2015-08-23 
*/

package com.tinochan.log4j2.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);

	public static void main(String[] args) {
	    
	    logger.debug("Test debug");
		logger.info("Test info");
		logger.error("Test error");
	}
}

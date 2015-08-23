/**
* <h1>Commos-logging console demo</h1>
* Commons-logging is an independent abstraction of other logging toolkits.
* Developer can simply plug in a specific logging implementation in the
* configuration file without touching in the code level.
* <p>
* Commons-logging can guess your preferred logging implementation. So it works
* without any commons-logging.properties file. If you want to use it with
* log4j2, you should include Commons Logging Bridge (og4j-jcl) in the build path.
* 
*
* @author  Tino Chan
* @version 1.0
* @since   2015-08-23 
*/

package com.tinochan.log4j2.commonslogging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConsoleDemo {
	
	private static Log logger = LogFactory.getLog(ConsoleDemo.class);
	 
    public static void main(String[] args)
    {
		logger.debug("Test debug");
		logger.info("Test info");
		logger.error("Test error");
    }
}

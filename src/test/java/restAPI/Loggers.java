package restAPI;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Loggers {

	static Logger logger = Logger.getLogger(Loggers.class);
	
	public static void main(String[] args)
	{
		//Configure logger
		BasicConfigurator.configure();
		logger.debug("Hello World!");
	}
}

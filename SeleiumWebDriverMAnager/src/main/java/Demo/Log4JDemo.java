package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	
	private static Logger logger = LogManager.getLogger(Log4JDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n Hello World..args.! \n");
		
		logger.trace("This is a trace message");
		
		logger.info("This is an Information Message");
		
		logger.info("This is information message");
		
		logger.error("This is an error message");
		
		logger.warn("This is a warning meassage");
		
		logger.fatal("This is a fatal message");
		
		System.out.println("\n COMPLETED \n");
		

	}

}

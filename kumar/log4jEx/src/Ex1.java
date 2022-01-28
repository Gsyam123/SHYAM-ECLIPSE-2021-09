import org.apache.log4j.Logger;

public class Ex1 {
	private static final Logger LOGGER = Logger.getLogger(Ex1.class);
	public static void main(String[] args) {
		
		LOGGER.trace("start...");
		LOGGER.debug("start...");
		LOGGER.info("start...");
		LOGGER.warn("start...");
		LOGGER.error("start...");
		LOGGER.fatal("start...");
	}
}

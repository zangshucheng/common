package factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志工厂
 * @author Administrator
 * @since 2019-10-13
 */
public class LogFactoryMgmnt {
	
	private static final String RUNTIME = "runTime";

	public Logger getRunTimeLogger() {
		return LoggerFactory.getLogger(RUNTIME);
	}
}

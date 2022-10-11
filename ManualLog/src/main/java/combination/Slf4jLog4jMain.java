package combination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Admin
 */
public class Slf4jLog4jMain {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jLog4jMain.class);
        //slf4j不支持fatal
        //logger.fatal("最高级日志");
        logger.error("Slf4j+Log4j错误日志");
        logger.warn("Slf4j+Log4j警示日志");
        logger.info("Slf4j+Log4j提示日志");
        logger.debug("Slf4j+Log4j调试信息");
        logger.trace("Slf4j+Log4j追踪信息");
    }
}






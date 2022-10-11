package alone;

import org.apache.log4j.Logger;

/**
 * @author Admin
 * 单独使用log4j打印日志
 */
public class Log4jMain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Log4jMain.class);
        logger.fatal("单独使用log4j打印日志--最高级日志");
        logger.error("单独使用log4j打印日志--错误日志");
        logger.warn("单独使用log4j打印日志--警示日志");
        logger.info("单独使用log4j打印日志--提示日志");
        logger.debug("单独使用log4j打印日志--调试信息");
        logger.trace("单独使用log4j打印日志--追踪信息");
    }
}

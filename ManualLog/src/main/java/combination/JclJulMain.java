package combination;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Admin
 * Jcl+Jul组合实现日志
 */
public class JclJulMain {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(JclJulMain.class);
        System.out.println(log.getClass());//如果项目中有log4j，则默认优先使用log4j。如果没有，则使用jul
        log.fatal("Jcl+Jul最高级日志");
        log.error("Jcl+Jul错误日志");
        log.warn("Jcl+Jul警示日志");
        log.info("Jcl+Jul提示日志");
        //默认日志级别为info,下面的不显示
        log.debug("Jcl+Jul调试信息");
        log.trace("Jcl+Jul追踪信息");
    }
}

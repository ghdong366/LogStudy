package alone;

import java.util.logging.Logger;

/**
 * @author Admin
 * 单独使用jul演示
 */
public class JulMain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(JulMain.class.getName());
        logger.info("java日志jul输出日志信息");
    }
}

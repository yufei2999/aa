package com.yufei.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

/**
 * Created by pc on 2016-11-22.
 */
public class Log4jToDb {

    private static final Logger logger = Logger.getLogger(Log4jToDb.class);

    public static void main(String[] args) {

        // 自定义参数字段
        MDC.put("userId", "1");
        MDC.put("userName", "admin");

        String hello = "Hello, World!";
        // 这两个没存入
        logger.trace("TRACE: " + hello);
        logger.debug("DEBUG: " + hello);
        // 这本个已存入
        logger.info("INFO: " + hello);
        logger.warn("WARN: " + hello);
        logger.error("ERROR: " + hello);
        logger.fatal("FATAL: " + hello);

    }
}

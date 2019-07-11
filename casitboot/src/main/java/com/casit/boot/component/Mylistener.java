package com.casit.boot.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Mylistener implements ServletContextListener {
    private Logger logger;

    public Mylistener(){
        logger=LoggerFactory.getLogger(Logger.class);
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("应用启动。。。。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("应用关闭。。。。。。");
    }
}

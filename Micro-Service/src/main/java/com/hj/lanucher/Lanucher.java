package com.hj.lanucher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lanucher {
    private static Logger logger = LoggerFactory.getLogger(Lanucher.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = null;
        try {
            context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
            context.refresh();
            context.start();
            while (true) {
                Thread.sleep(300 * 1000);
            }
        } catch (Exception e) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            logger.error(sdf.format(new Date()) + " startup error", e);
            context.close();
            System.exit(-1);
        }

    }
}

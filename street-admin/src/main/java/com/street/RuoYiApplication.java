package com.street;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author street
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("          __                         __\n" +
                "  _______/  |________   ____   _____/  |_\n" +
                " /  ___/\\   __\\_  __ \\_/ __ \\_/ __ \\   __\\\n" +
                " \\___ \\  |  |  |  | \\/\\  ___/\\  ___/|  |\n" +
                "/____  > |__|  |__|    \\___  >\\___  >__|\n" +
                "     \\/                    \\/     \\/\n" +
                "------------项目启动启动成功------------  \n" +
                "");
    }
}

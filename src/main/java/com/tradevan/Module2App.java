package com.tradevan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Module2
 *
 */
@SpringBootApplication
public class Module2App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(Module2App.class, args).close();
        System.out.println("Module2");
    }
}

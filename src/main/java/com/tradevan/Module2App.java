package com.tradevan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tradevan.common.CommonTool;

/**
 * Module2
 *
 */
@SpringBootApplication
public class Module2App implements CommandLineRunner
{
    public static void main( String[] args )
    {
        SpringApplication.run(Module2App.class, args).close();
        System.out.println("Module2");
    }
    
    @Autowired
    private CommonTool tool;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Run Module2!");
        System.out.println(tool.getText());
    }
}

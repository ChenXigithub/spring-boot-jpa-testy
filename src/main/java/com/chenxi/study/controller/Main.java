package com.chenxi.study.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by admin on 17-1-23.
 */
@SpringBootApplication
public class Main
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class,args);
    }
}

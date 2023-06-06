package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {


    Properties pro;

    //constructor
    public ReadConfig() {

        File src = new File("C:/Users/Mario_Granados1/Documents/Automation4Testers/ProjectNew22/mentoringFramework/src/main/Configuration/config.properties");

        try {

            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }

    }

    //methods to read from config.properties file
    public String getApplicationURL() {
        String url = pro.getProperty("baseURL");
        return url;
    }

    public String getUsername() {
        String username = pro.getProperty("userName");
        return username;
    }

    public String getPassword() {
        String password = pro.getProperty("password");
        return password;
    }

}

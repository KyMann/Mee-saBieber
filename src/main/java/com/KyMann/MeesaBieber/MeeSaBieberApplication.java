package com.KyMann.MeesaBieber;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import twitter4j.*;

@SpringBootApplication
public class MeeSaBieberApplication {
	//private static ApplicationContext context = new ClassPathXmlApplicationContext("SpringEmperorTrump.xml"); //cannot instantiate beans manually when they are hibernate interfaces
	//private static DatabaseTweetsDao emperorTweetsDao = (DatabaseTweetsDao) context.getBean("EmperorTweetsDaoBean");


    public static void main(String[] args) throws TwitterException {
		SpringApplication.run(MeeSaBieberApplication.class, args);
	}

}
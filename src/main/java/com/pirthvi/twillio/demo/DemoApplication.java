package com.pirthvi.twillio.demo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {
    private final static String ACCOUNT_SID = "yourAccoundSID";
    private final static String AUTH_ID = "AuthID";
    static {
        Twilio.init(ACCOUNT_SID, AUTH_ID);
    }
    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        Message.creator(new PhoneNumber("to number"), new PhoneNumber("your trial number"),
                "Your Messages").create();
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

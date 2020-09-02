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
    private final static String ACCOUNT_SID = "ACb03913c1569296d90204b4f8b9d72e44";
    private final static String AUTH_ID = "2351191f3a57fd066748a965e063875b";
    static {
        Twilio.init(ACCOUNT_SID, AUTH_ID);
    }
    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        Message.creator(new PhoneNumber("+923473330209"), new PhoneNumber("+12029463913"),
                "Your Messages").create();
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

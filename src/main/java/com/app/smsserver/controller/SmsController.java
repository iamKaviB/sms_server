package com.app.smsserver.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController
public class SmsController {

    @GetMapping("/send")
    public ResponseEntity<String> sendSMS() {

        Twilio.init("AC5e6c8b6fb1ffbd9fdd0d5e52f87f58af", "bc1ec6fa4d8ae0a14cf74a5e3e53ba09");

        Message.creator(new PhoneNumber("94759115870"),
                new PhoneNumber(" 94759115870"), "Hello from Twilio 📞").create();

        return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
    }
}
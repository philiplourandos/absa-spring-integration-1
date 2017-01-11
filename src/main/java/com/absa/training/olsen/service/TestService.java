package com.absa.training.olsen.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * Created by bevynne on 2017/01/11.
 */
@Service
public class TestService {
    public void alpha(Message msg) {
        System.out.println("Alhpa file: " + msg.getPayload().toString() + "\n");
    }

    public void number(Message  msg) {
        System.out.println("Numeric file: " + msg.getPayload().toString() + "\n");
    }
}

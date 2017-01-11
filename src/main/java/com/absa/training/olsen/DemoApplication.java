package com.absa.training.olsen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		demoInMemoryIntegration();
	}

	private static void demoInMemoryIntegration() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

		// Get the channel.
		//PollableChannel channel = ctx.getBean("channel", PollableChannel.class);

		// Send some messages to the channel.
//		for (int i = 0; i < 10; i++) {
//			channel.send(new GenericMessage<String>("Hi from message " + i));
//		}
//
//		// Receive messages from channel.
//		Message<?> reply;
//		while ((reply = channel.receive(100)) != null) {
//
//			// Get message payload.
//			System.out.printf("Received message payload: %s\n", reply.getPayload());
//
//			// Get message headers.
//			MessageHeaders headers = reply.getHeaders();
//			System.out.printf("\tID %s, timestamp %s\n", headers.getId(), new Date(headers.getTimestamp()));
//		}
	}
}

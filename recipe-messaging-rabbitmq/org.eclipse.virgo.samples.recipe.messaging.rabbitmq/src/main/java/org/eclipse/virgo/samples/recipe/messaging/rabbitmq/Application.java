package org.eclipse.virgo.samples.recipe.messaging.rabbitmq;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {

	final static String queueName = "spring-boot";

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private Receiver receiver;

    @PostConstruct
    public void init() throws InterruptedException {
        System.out.println("Waiting five seconds...");
        Thread.sleep(5000);
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(queueName, "Hello from RabbitMQ!");
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    }
}

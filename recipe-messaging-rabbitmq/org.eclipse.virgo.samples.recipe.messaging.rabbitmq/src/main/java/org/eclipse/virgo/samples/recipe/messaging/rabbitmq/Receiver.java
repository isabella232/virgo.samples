package org.eclipse.virgo.samples.recipe.messaging.rabbitmq;

import java.util.concurrent.CountDownLatch;

//tag::type[]
public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);

	public void receiveMessage(String message) {
		System.out.println("Received <" + message + ">");
		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}

}
//end::type[]

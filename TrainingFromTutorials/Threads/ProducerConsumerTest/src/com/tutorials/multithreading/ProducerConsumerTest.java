package com.tutorials.multithreading;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue();
        CustomProducer producer = new CustomProducer(sharedQueue);
        producer.start();
        CustomConsumer consumer01 = new CustomConsumer(sharedQueue);
        consumer01.setName("consumer 01");
        consumer01.start();
        CustomConsumer consumer02 = new CustomConsumer(sharedQueue);
        consumer02.setName("consumer 02");
        consumer02.start();
    }
}

package transferqueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueDemo {

    public static TransferQueue queue;

    TransferQueueDemo(){
        this.queue = new LinkedTransferQueue();
    }

    public static void main(String[] args) {
        //Initialize demo application
        TransferQueueDemo application = new TransferQueueDemo();

        //Single producer and multiple consumer example
        Producer p1 = new Producer("producer_1");
        Thread producerThread = new Thread(p1);
        producerThread.start();

        Consumer c1 = new Consumer("consumer_1");
        Thread consumerThread1 = new Thread(c1);
        consumerThread1.start();

        Consumer c2 = new Consumer("consumer_2");
        Thread consumerThread2 = new Thread(c2);
        consumerThread2.start();

        //Drain consumer example
        /*Producer2 p2 = new Producer2("producer_2");
        Thread producerThread = new Thread(p2);
        producerThread.start();

        DrainConsumer c1 = new DrainConsumer("drain_consumer_1");
        Thread consumerThread1 = new Thread(c1);
        consumerThread1.start();*/
    }
}

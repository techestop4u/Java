package transferqueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.logging.Logger;

public class Producer2 implements Runnable{
    private Logger logger = Logger.getLogger(Producer2.class.getName());
    private static int counter = 0;

    private String producerName ;

    Producer2(String name){
        this.producerName = name;
    }
    @Override
    public void run() {
        String message;
        LinkedTransferQueue q = (LinkedTransferQueue) TransferQueueDemo.queue;
            while(true) {
                message = "TestMessage_"+(++counter);
                logger.info("["+producerName+"] Putting message " + message + " into the queue");
                boolean qPutSuccessful = q.offer(message);
                try {
                    logger.info("["+producerName+"] Sleep for 1s.");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
    }
}

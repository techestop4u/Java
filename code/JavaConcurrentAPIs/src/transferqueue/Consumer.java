package transferqueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.logging.Logger;

public class Consumer implements Runnable{

    private Logger logger = Logger.getLogger(Consumer.class.getName());
    private String consumerName ;

    Consumer(String name){
        this.consumerName = name;
    }

    @Override
    public void run() {

        LinkedTransferQueue q = (LinkedTransferQueue) TransferQueueDemo.queue;
        while(true){

            try {
                logger.info("["+consumerName+"] Trying to get message from queue.");
                String message = (String) q.take();
                logger.info("["+consumerName+"] Message read: "+message);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }
}

package transferqueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Producer implements Runnable{

    private Logger logger = Logger.getLogger(Producer.class.getName());
    private static int counter = 0;

    private String producerName ;

    Producer(String name){
        this.producerName = name;
    }
    @Override
    public void run() {
        String message;
        LinkedTransferQueue q = (LinkedTransferQueue) TransferQueueDemo.queue;
        try {
            while(true) {
                message = "TestMessage_"+(++counter);
                logger.info("["+producerName+"] Trying to transfer the message : "+message);
                boolean transferResult = q.tryTransfer(message, 3, TimeUnit.SECONDS);
                logger.info("["+producerName+"] Transfer result: " + (transferResult ? "Successful" : "Failed"));
                if(!transferResult){

                    logger.info("["+producerName+"] Wait for consumers.");
                    while(!q.hasWaitingConsumer()){
                        Thread.sleep(3000);
                    }
                    logger.info("["+producerName+"] Start producing again.");
                }else{
                    //For simulating delay in producing the messages
                    Thread.sleep(1000);
                }

            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

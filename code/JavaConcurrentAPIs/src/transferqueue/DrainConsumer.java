package transferqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;
import java.util.logging.Logger;

public class DrainConsumer implements  Runnable{
    private Logger logger = Logger.getLogger(Consumer.class.getName());
    private String consumerName ;

    DrainConsumer(String name){
        this.consumerName = name;
    }

    @Override
    public void run() {

        LinkedTransferQueue q = (LinkedTransferQueue) TransferQueueDemo.queue;

        try {
            while(true){

                Thread.sleep(5000);

                    logger.info("["+consumerName+"] Trying to drain all the messages from queue.");
                    List<String> messages = new ArrayList<>();
                    int numOfMessagesRead = q.drainTo(messages);
                    //Drain maximum number of messages
                    //int numOfMessagesRead = q.drainTo(messages,2);
                    logger.info("["+consumerName+"] Number of messages read : "+ numOfMessagesRead);
                    logger.info("["+consumerName+"] Printing all the messages read.....");
                    messages.stream().forEach(msg -> System.out.println(msg));


            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

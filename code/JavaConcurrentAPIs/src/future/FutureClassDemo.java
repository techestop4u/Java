package future;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.*;
import java.util.logging.Logger;

public class FutureClassDemo {

    static Random r = new Random();

    public static void main(String[] args) {
        Logger logger = AppLogger.initializeLogger();
//        //Example of future object
//        Callable<Boolean> callableTask = () -> {
//            logger.info("Callable task has started executing.");
//            return true;
//        };
//
//        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        Future<Boolean> futureObj = executorService.submit(callableTask);
//
//        try {
//            System.out.println("Printing result from callable task: "+futureObj.get());
//            executorService.shutdown();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }





        //Example of RunnableFuture

//        try {
//            //FutureTask from Runnable
//            FutureTask<String> futureTask = new FutureTask<>(() -> {
//                logger.info("Print from Runnable");
//            },"Hello from Runnable");
//
//            futureTask.run();
//           logger.info(futureTask.get());
//
//           //Future task from Callable
//            futureTask = new FutureTask<>(() -> {
//                return "Hello from Callable";
//            });
//            futureTask.run();
//            logger.info(futureTask.get());
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }




        //Example of Scheduled future
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//        Callable<String> scheduledCallable = () ->{
//          logger.info("Scheduled Callable task started");
//          return "Callable run successful.";
//        };
//
//        logger.info("Scheduled Callable task submitted.");
//        ScheduledFuture<String> resultFromCallable = scheduledExecutorService.schedule(scheduledCallable,5L, TimeUnit.SECONDS);
//        try {
//            logger.info("Result from callable: "+resultFromCallable.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

//        Runnable scheduledRunnable = () -> {
//            logger.info("Runnable task is running");
//        };
//        logger.info("Scheduled runnable task submitted to run at fixed rate.");
//        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(scheduledRunnable,1, 3, TimeUnit.SECONDS);
//        try {
//            logger.info((String) scheduledFuture.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }


        Runnable scheduledRunnable = () -> {
            int delay = r.nextInt(10)  + 2;

            logger.info("Runnable task is running with delay "+delay);
            try {
                Thread.sleep(delay*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        logger.info("Scheduled runnable task submitted to run at fixed delay.");
        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(scheduledRunnable,1,3, TimeUnit.SECONDS);
        try {
            logger.info((String) scheduledFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        scheduledExecutorService.shutdown();
    }
}

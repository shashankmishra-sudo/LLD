package Semaphore;

import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Queue<Shirt> store;
    int maxsize;
    String name;
    Semaphore semaproducer;
    Semaphore semaConsumer;

    public Consumer(int maxSize,String name,Queue<Shirt> store,Semaphore semaConsumer,Semaphore semaProducer){
        this.maxsize=maxSize;
        this.name=name;
        this.store=store;
        this.semaproducer=semaProducer;
        this.semaConsumer=semaConsumer;
    }


    @Override
    public void run() {
        while(true){
            try {
                semaConsumer.acquire();
                System.out.println("Current size "+store.size()+" purchased by "+ name);
                store.remove();
                semaproducer.release();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

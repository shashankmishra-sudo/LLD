package Semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements  Runnable{
    int maxSize;
    String name;
    Queue<Shirt> store;
    Semaphore semaConsumer;
    Semaphore semaProducer;
    public Producer(int maxSize,String name,Queue<Shirt> store,Semaphore semaConsumer,Semaphore semaProducer){
        this.maxSize=maxSize;
        this.semaConsumer=semaConsumer;
        this.semaProducer=semaProducer;
        this.name=name;
        this.store=store;
    }
    @Override
    public void run() {
        while (true){
            try {
                semaProducer.acquire();
                System.out.println("Current Size "+store.size()+" added by producer "+name);
                store.add(new Shirt());
                semaConsumer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

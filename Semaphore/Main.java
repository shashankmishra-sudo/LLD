package Semaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Shirt> store=new LinkedList();
        //int maxSize,String name,Queue<Shirt> store,Semaphore semaConsumer,Semaphore semaProducer
        Semaphore producerSemaphore=new Semaphore(5);
        Semaphore consumeremaphore=new Semaphore(0);

        Producer p1=new Producer(5,"p1",store,consumeremaphore,producerSemaphore);
        Producer p2=new Producer(5,"p2",store,consumeremaphore,producerSemaphore);
        Producer p3=new Producer(5,"p3",store,consumeremaphore,producerSemaphore);
        Producer p4=new Producer(5,"p4",store,consumeremaphore,producerSemaphore);
        Producer p5=new Producer(5,"p5",store,consumeremaphore,producerSemaphore);


        Consumer c1=new Consumer(0,"c1",store,consumeremaphore,producerSemaphore);
        Consumer c2=new Consumer(0,"c2",store,consumeremaphore,producerSemaphore);
        Consumer c3=new Consumer(0,"c3",store,consumeremaphore,producerSemaphore);
        Consumer c4=new Consumer(0,"c4",store,consumeremaphore,producerSemaphore);
        Consumer c5=new Consumer(0,"c5",store,consumeremaphore,producerSemaphore);

        Thread tp1=new Thread(p1);tp1.start();
        Thread tp2=new Thread(p2);tp2.start();
        Thread tp3=new Thread(p3);tp3.start();
        Thread tp4=new Thread(p4);tp4.start();
        Thread tp5=new Thread(p5);tp5.start();

        Thread tc1=new Thread(c1);tc1.start();
        Thread tc2=new Thread(c2);tc2.start();
        Thread tc3=new Thread(c3);tc3.start();
        Thread tc4=new Thread(c4);tc4.start();
        Thread tc5=new Thread(c5);tc5.start();




    }
}

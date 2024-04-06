package CallableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exe= Executors.newFixedThreadPool(2);
        DeliveryChargeCalculator deliveryObj=new DeliveryChargeCalculator();
        TaxCalculator taxObj=new TaxCalculator();
        Future<Integer> taxFuture=exe.submit(taxObj);
        Future<Integer> deliveryFuture=exe.submit(deliveryObj);

        Integer x=taxFuture.get();
        Integer y=deliveryFuture.get();

        System.out.println(x+y);
    }
}

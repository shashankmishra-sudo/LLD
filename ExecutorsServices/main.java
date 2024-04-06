package ExecutorsServices;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        ExecutorService exe= Executors.newFixedThreadPool(2);
        NumberPrinter np=new NumberPrinter();
        exe.submit(np);
    }
}

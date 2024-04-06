package ExecutorsServices;

public class NumberPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("This is number printer class");
    }
}

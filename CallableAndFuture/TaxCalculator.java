package CallableAndFuture;

import java.util.concurrent.Callable;

public class TaxCalculator implements Callable {
    @Override
    public Integer call() throws Exception {
        System.out.println("taxCaculator");
        return 5;
    }
}

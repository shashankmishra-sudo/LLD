package CallableAndFuture;

import java.util.Random;
import java.util.concurrent.Callable;

public class DeliveryChargeCalculator implements Callable {

    @Override
    public Integer call() throws Exception {
        Random rd=new Random();
        return rd.nextInt();
    }
}

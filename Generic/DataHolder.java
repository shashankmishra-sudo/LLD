package Generic;

public class DataHolder<A,B,C> {
    A first;
    B second;
    C third;

    @Override
    public String toString() {
        return "DataHolder{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}

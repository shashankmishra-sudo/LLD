package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Count c1=new Count(1,"Shashank");
        Count c2=new Count(1,"Akash");
        System.out.println(c2.equals(c1));//Compares the Overriden Logic (otherwise works like ==)
        System.out.println(c2==c1);//Compares the hashcode
        HashSet<Count> set=new HashSet<>();
        set.add(c1);
        set.add(c2);
        System.out.println(set);
    }
}

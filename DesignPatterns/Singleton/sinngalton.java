package DesignPatterns.Singleton;

public class sinngalton {
    public static sinngalton instance;
    private sinngalton(){};
    public  static sinngalton getInstance(){
        if(instance==null) {
            synchronized (sinngalton.class) {
                if (instance == null) {
                    instance = new sinngalton();
                }
            }

        }
        return instance;
    }

    /*
    1.Create a variable if same class type keep it public static
    2.Make the constructor private
    3.Create a method which will create the obj
        method should be static
        Apply double check rule for thread safe
    */
}

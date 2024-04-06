package DesignPatterns.Singleton;

public class main {
    public static void main(String[] args) {

      /*
        sinngalton s1= sinngalton.getInstance();
        sinngalton s2= sinngalton.getInstance();
        sinngalton s3= sinngalton.getInstance();
        sinngalton s4= sinngalton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
      */

       DBConn db1=DBConn.getDBConnObj();
       DBConn db2=DBConn.getDBConnObj();
       DBConn db3=DBConn.getDBConnObj();
       DBConn db4=DBConn.getDBConnObj();

        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);
        System.out.println(db4);


        System.out.println(db1.connect());
        System.out.println(db1.connect());
        System.out.println(db1.connect());
        System.out.println(db1.connect());
        System.out.println(db1.connect());
    }
}

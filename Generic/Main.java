package Generic;

public class Main {
    public static void main(String[] args) {
        DataHolder<Integer,String,Double> student=new DataHolder<Integer, String, Double>();
        DataHolder<Integer,Integer,Long> place=new DataHolder<>();
        /*
        * With the help of generic we can give data type at run time
        * */

      student.first=5;
      student.second="Shashank";
      student.third=33.0909;

      place.first=54;
      place.second=543;
      place.third= Long.valueOf(5);

        System.out.println(student);
        System.out.println(place);
    }
}

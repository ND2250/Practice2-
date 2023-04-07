import java.util.ArrayList;

public class Scorecard {

    //Arraylist for non -  static method

    public static void digital(){

        ArrayList scr = new ArrayList();
        scr.add("Name");
        scr.add("Bowler");
        scr.add("Batsman");
        scr.add(67);
        scr.add(45.78);
        scr.add("A");


        System.out.println(scr.get(3));
        System.out.println(scr.get(4));
        System.out.println(scr.get(1));
        System.out.println(scr.get(5));
        System.out.println(scr.size());
        System.out.println(scr);

    }

    public static void main(String[] args) {
        Scorecard ref = new Scorecard();
        digital();

    }



}

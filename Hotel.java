import java.util.ArrayList;

public class Hotel {
    // Arraylist concept

    // create a static method

    static void checkin(){
        // we need to create a Arraylist
        ArrayList ht = new ArrayList();
        ht.add(100);
        ht.add("Bedsheets");
        ht.add("Tables");
        ht.add("Crokery");
        ht.add("Mirrors");


        System.out.println("All details : " + ht.get(3));
        System.out.println(ht.remove(2));
        System.out.println(ht.add(4));
        System.out.println(ht.size());


    }

    public static void main(String[] args) {
        checkin();
    }

}

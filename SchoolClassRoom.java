import java.util.ArrayList;

public class SchoolClassRoom {

    public static void batch(){
        // Create an Arraylist
        ArrayList cl = new ArrayList();
        cl.add("Banch");
        cl.add("Teachers");
        cl.add("Acadamic record");
        cl.add(7878);
        cl.add(555);
        cl.add('A');

        System.out.println(cl.get(4));
        System.out.println(cl.get(2));
        System.out.println(cl.get(1));
        System.out.println(cl);
        System.out.println(cl.size());
        System.out.println(cl.remove(4));

    }


    public static void main(String[] args) {
        batch();
    }
}

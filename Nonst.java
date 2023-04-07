import java.util.ArrayList;

public class Nonst {

    void total(){

        ArrayList Nonst = new ArrayList();
        Nonst.add(100);
        Nonst.add("mkmklwhklw");
        Nonst.add("Viral");
        Nonst.add("Jaydeep");
        Nonst.add(667.78);
        Nonst.add('A');


        System.out.println(Nonst.get(1));
        System.out.println(Nonst.add(3));
        System.out.println(Nonst.get(4));
        System.out.println(Nonst);
        System.out.println(Nonst.size());

    }

    public static void main(String[] args) {
        // Non - static method so we are calling via object

        Nonst ref = new Nonst();
        ref.total();
    }



}

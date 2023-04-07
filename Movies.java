import java.util.ArrayList;

public class Movies {


    // create a method static for Arraylist

    static void producer(){
        ArrayList Movies = new ArrayList();
        Movies.add("Bazigar");
        Movies.add("Prod");
        Movies.add("Status");
        Movies.add("Numbers");
        Movies.add('A');
        Movies.add(8768768);
        Movies.add(788989.44);


        System.out.println(Movies.get(2));
        System.out.println(Movies.get(4));
        System.out.println(Movies.get(3));
        System.out.println(Movies.size());
        System.out.println(Movies.remove(5));
        System.out.println(Movies);
        System.out.println(Movies.remove(4));

    }

    public static void main(String[] args) {
        // we created a static method so we can call via method name.

        producer();
    }


}

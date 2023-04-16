import java.util.ArrayList;

public class GroceryStore {

    // Non static method

    void sale(){
        // Create an Arrylist

        ArrayList kiran = new ArrayList();
        kiran.add("Almonds");
        kiran.add("Cashew");
        kiran.add("Sweeets");
        kiran.add(65757);
        kiran.add(676.67);

        System.out.println("All suppliers : " + kiran.get(4) );
        System.out.println(kiran.get(2));
        System.out.println(kiran);
        System.out.println(kiran.size());


    }

    public static void main(String[] args) {
        // Create an object
        GroceryStore gs = new GroceryStore();
        gs.sale();

    }

}

public class Constru {
    int A = 23;



    Constru(){
        A = 24;
    }

    public static void main(String[] args) {
        Constru ref = new Constru();

        System.out.println("Total number " + ref.A);
    }
}

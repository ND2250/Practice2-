package Sports;

public class Cricket {

    String name = "Batsman";
    char Brand = 'a';


    Cricket(){

        name = "Bowler";
        Brand = 'Á';
    }

    public static void main(String[] args) {
        Cricket cr = new Cricket();
        System.out.println(cr.Brand);
        System.out.println(cr.name);
    }
}

package company;

public class Construpara {
    // initiate the variable

    String name;
    int number;

    // Create a constructor

    Construpara(String partyname , int totalNumbers){
        name = partyname ;
        number = totalNumbers ;

    }

    public static void main(String[] args) {
        // create an object
        Construpara cs = new Construpara("Viable", 7876);
        System.out.println(cs.name + " " + cs.number);

    }




}

package inht2;

public class Rungtu {

    public static String group (String name , String Lastname){
        return name + Lastname;
    }


    public static void main(String[] args) {

        String fullName = group("Ashok" , "Jadhav");
        System.out.println(fullName);

        System.out.println();
        Lj b = new Lj();
        b.vat();
        b.net();
        b.total();

        System.out.println();
        Ljeng en = new Ljeng();
        en.net();
        en.total();
        en.vat();

        System.out.println();
        Ljphar lp = new Ljphar();
        lp.net();
        lp.total();
        lp.vat();

        System.out.println();
        Lab lb = new Lab();
        lb.total();
        lb.net();
    }





}

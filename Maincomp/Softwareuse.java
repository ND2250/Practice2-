package Maincomp;

public class Softwareuse {

    public static int waterfall(int numbers , int types){
        return numbers + types;

    }

    static String agile(String name){
        return name;
    }



    public static void main(String[] args) {
        int total = waterfall(899,898);
        String full = agile("Specification");
        System.out.println(total);
        System.out.println(full);
    }


}

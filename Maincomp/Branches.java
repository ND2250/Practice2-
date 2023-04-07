package Maincomp;

public class Branches {

    public static int chat(int data, int total){
        return data * total;

    }

    static String details(String name , String lastname){
        return  name + lastname;
    }

    public static void main(String[] args) {
        int to = chat(2103,7879);
        System.out.println("As per details : " + to);
        String party = details("Vidhata","Patel");
        System.out.println("As per norms : " + "  " +  party);
    }


}




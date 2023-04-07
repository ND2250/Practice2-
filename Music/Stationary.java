package Music;

public class Stationary {

    static void books (int numbers , String company ){
        System.out.println("Total numbers : " + numbers + " " + "Company name : " + company );
    }
    public static void pen(String name , float model){
        System.out.println("Names : " + name + " " +  " Models : " + model);

    }

    public static void main(String[] args) {

        // Call via method name
        books(566,"Classmate");
        pen("Users",8.8f);
    }
}

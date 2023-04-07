package Music;

    public class Instruments {

    void brands (int numbers , String name){
        System.out.println("Total numbers : " + numbers);
        System.out.println("Name : " + name);

    }

    void users(float model , char starts){
        System.out.println("Model name : " + model);
        System.out.println("Starts with : " + starts);

    }

    public static void main(String[] args) {

        // call via object
        Instruments in = new Instruments();
        in.brands(78787,"Yamaha");
        in.users(878.89f,'Y');

    }
}

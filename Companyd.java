public class Companyd {
    // initiate variable
    int employees;
    String name;

    // create a constructor
    // pass the information in to constructor so its parameter
    Companyd(int numbers ,String designation){
        employees = numbers;
        name = designation;



    }

    public static void main(String[] args) {
        // create an object
        // call the constructor
        Companyd cp = new Companyd(565656,"Manager");
        System.out.println("All employess : " + cp.employees + " " + "Level : " + cp.name );

    }


}

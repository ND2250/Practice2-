package company;

public class Cricketers {

    // initiate the variable

    String name;
    int salary;

    // create a constructor

    // Passing the data in to the constructor parameter
    Cricketers(String kkrPlayer , int AnnualSalary){

        name = kkrPlayer;
        salary = AnnualSalary;

    }

    public static void main(String[] args) {
        // create an object

        Cricketers ck = new Cricketers("Nitish Ranaa", 676767);
        System.out.println("Captain: " + ck.name);
        System.out.println("Contracted amount: " + ck.salary );
    }
}

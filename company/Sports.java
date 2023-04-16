package company;

public class Sports {

 // Class Attributes

    char grade = 'A';

    // create a constructor

    Sports(){
      // initial the value of attributes

        grade = 'B';
        grade = 'A';
        grade = 'C';

    }

    public static void main(String[] args) {
        // create an object

        Sports sp = new Sports();
        System.out.println("Salary grade cricket player : " + sp.grade);
    }



}

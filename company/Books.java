package company;

public class Books {

    // initiate the variable

    String name;
    char grade;
    float per;

    // create a constructor

    Books(String student , char level , float result ){
        // Declared the variables
        name = student;
        grade = level;
        per = result;

   }

    public static void main(String[] args) {
        // create an object
        Books bs = new Books("Moni",'A',89.4f);
        System.out.println("Toppers name : " + bs.name + "\n " + "Toppers grade : " + bs.grade + "\n " + "Toppers result : " + bs.per);
    }
}

public class Studentsrec {

    // Declared a variable


    float percentage;
    char grade;
    String name;

    // create a constructor
    // Pass the information to the parameter
    Studentsrec(float finalper , char finalgrade , String stname){

        percentage = finalper;
        grade = finalgrade;
        name = stname;

    }

    public static void main(String[] args) {
        Studentsrec st = new Studentsrec(87.44f,'A',"Gaurav");
        System.out.println("Summer exam : " + st.percentage + " " + "Summer exam : " + st.grade);
        System.out.println("Summer exam : " + st.name);
    }


}

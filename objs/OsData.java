package objs;

public class OsData {

    // Initiate the variable

    String name;
    int numbers;
    char grade;
    float per;

    public static void main(String[] args) {
        // create an object

        OsData obj = new OsData();
        obj.name = "Radhe";
        obj.grade = 'A';
        obj.per = 67.78f;
        obj.numbers = 657587;

        System.out.println("Name of the student : " + obj.name);
        System.out.println("Garde : " + obj.grade);
        System.out.println("final marks : " + obj.per + " " + "Total number at state level : " + obj.numbers);

    }


}

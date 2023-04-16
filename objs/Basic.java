package objs;

import java.sql.SQLOutput;

public class Basic {
    // Initiate and declared a variable

    String name = "Rak";
    int numbers = 787978;
    float per = 565.7f;
    char last = 'Z';

    public static void main(String[] args) {
        // create an object

        Basic bs =  new Basic();
        System.out.println("Students name :" + bs.name);
        System.out.println("Total numbers : " + bs.numbers);
        System.out.println("Total per : " + bs.per);
        System.out.println("Grade : " + bs.last);
    }
}

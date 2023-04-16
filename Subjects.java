import javax.xml.namespace.QName;
import java.util.Arrays;

public class Subjects {
    public static void main(String[] args) {

//        int A [] = new int[3];
//
//        A[0] = 100;
//        A[1] = 200;
//        A[2] = 300;
//
//        System.out.println(A[0]);
//        System.out.println(A[2]);
//
//        String name[] = new String[4];
//
//        name[0] = "Ajay";
//        name[1] = "Vijay";
//        name[2] = "Wasim";
//        name[3] = "Karnma";
//
//        System.out.println(Arrays.toString(name));
//        System.out.println(name.length);

        Object sub[] = new Object[4];
        sub[0] = 100;
        sub[1] = 200;
        sub[2] = "Total";
        sub[3] = "Class";

        for (int i = 0;i< sub.length;i++){
            System.out.println("Total estimated: " + sub[i]);
        }




    }
}

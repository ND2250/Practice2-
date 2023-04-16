import java.util.Arrays;

public class Data {
    public static void main(String[] args) {

//        int A[] = new int[3];
//        A[0] = 100;
//        A[1] = 200;
//        A[2] = 300;
//
//
//        System.out.println("Total number of: " + A[2]);
//        System.out.println(A.length);
//        System.out.println(Arrays.toString(A));

//        String name [] = new String[2];
//        name[0] = "Total";
//        name[1] = "Multipalle";
//
//        System.out.println(Arrays.toString(name));
//        System.out.println(name.length);
//        System.out.println("All done:" + name[1]);
//

        Object fr[] = new Object[3];

        fr[0] = 100;
        fr[1] = "Probable";
        fr[2] = "All";


        for(int i = 0;i< fr.length;i++){
            System.out.println("Submitted: " + fr[i]);
        }


    }
}

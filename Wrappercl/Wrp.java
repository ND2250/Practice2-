package Wrappercl;

import java.util.ArrayList;

public class Wrp {

    public static void main(String[] args) {
        // All about data types
        // we can convert primitive data types in to wrapper class

        //  P TO W

        int A  = 10;

        Integer AA = new Integer(A); // Boxing wrapper class
        //    or

        Integer BB = A ; // Auto Boxing

        Integer CC  = new Integer(A); // Boxing

        Integer bb = A; // Auto boxing

       //  W to P

        int B = AA.intValue(); // unboxing

        int C  = BB; // Auto Unboxing

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);

    }


}

package sportscentre;

import java.util.Arrays;

public class Football {
    public static void main(String[] args) {

        Object ft[] = new Object[3];
        ft[0] = 100;
        ft[1] = "ALL DONE";
        ft[2] = 67676;


        System.out.println(Arrays.toString(ft));
        System.out.println(ft.length);

        for(int i=0; i< ft.length;i++){
            System.out.println("Total number should be: " +ft[i] );
        }
    }
}

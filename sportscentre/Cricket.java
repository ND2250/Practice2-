package sportscentre;

import java.util.Arrays;

public class Cricket {
    public static void main(String[] args) {


        String player [] = new String[3];

        player[0] =  "Tewatia";
        player[1] = "Company";
        player[2] = "Anmol";

        System.out.println("All names: " + player[2]);
        System.out.println("All numbers: "+ player.length);
        System.out.println("Äll kit:" + Arrays.toString(player));
        for(int i=0;i< player.length;i++ ){
            System.out.println( player[i]);
        }
    }
}

package Sports;


public class Tennis {

    int numbers;
    String name;
    char alpha;
    float round;


    Tennis(int num,String playerName,char seq,float nume ){

        numbers = num;
        name = playerName;
        alpha = seq;
        round = nume;

    }

    public static void main(String[] args) {
        Tennis tt = new Tennis(565,"All selected",'A',7.3f);
        System.out.println("Total numbers  : " + tt.numbers);
        System.out.println("Total players : " + tt.name);
        System.out.println("Grades : " + tt.alpha);
        System.out.println("Total round : " + tt.round);
    }
}

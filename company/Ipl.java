package company;

public class Ipl {

    String name;
    int prize;

    Ipl(String winner , int money){

        name = winner;
        prize = money;

    }

    public static void main(String[] args) {
        Ipl cc = new Ipl("Gujarat Titans",1200000000);
        System.out.println("IPL 2023 WINNER: " + cc.name + " " + "Prize: " + cc.prize);
    }
}

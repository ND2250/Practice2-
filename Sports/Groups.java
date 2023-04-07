package Sports;

public class Groups {

    int numbers;
    String name;


    Groups(int total , String players){

        numbers = total;
        name = players;

    }

    public static void main(String[] args) {
        Groups gg = new Groups(676,"dy");
        System.out.println(gg.name + " " + gg.numbers);

    }
}

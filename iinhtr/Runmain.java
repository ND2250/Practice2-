package iinhtr;

public class Runmain {

    // Method overloading
    public static int all(int total,int gross){
        return total+ gross;



    }

    public static void main(String[] args) {

        int net = all(4545,6767);
        System.out.println(net);

        System.out.println();
        Gpsubsid gp = new Gpsubsid();
        gp.data();
        gp.expenses();
        gp.numbers();
        gp.Brokers();
        gp.clients();
        gp.services();


        System.out.println();
        Subsid2 sb = new Subsid2();
        sb.Brokers();
        sb.data();
        sb.clients();
        sb.expenses();
        sb.services();
        sb.numbers();


        System.out.println();
        Subsid3 sd = new Subsid3();
        sd.Brokers();
        sd.data();
        sd.clients();
        sd.expenses();
        sd.services();
        sd.numbers();

        System.out.println();
        Subsid4 ss = new Subsid4();
        ss.clients();
        ss.Brokers();
        ss.services();
    }
}

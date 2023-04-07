public class Reg {
    // Variable declared
    String name = "Pan";


    Reg(){
        name = "Gross";
    }

    public static void main(String[] args) {
        Reg bv = new Reg();
        System.out.println(bv.name);
    }
}

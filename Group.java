public class Group {


    void gross(){
        try {
            net();
        }catch(ArithmeticException e) {
        }
    }




    public void net() throws ArithmeticException {
        int A = 10/0;

    }

    public static void main(String [] args ) throws  ArithmeticException{
        Group gp = new Group();
        gp.gross();

    }
}

public class Fullpay {

    // Non - static method create

    void empty(){

        try {

            run();
        }catch (ArithmeticException e){

        }
    }


    public void run() throws ArithmeticException {
        int A = 3/0;

    }

    public static void main(String[] args) throws ArithmeticException {
        Fullpay fp = new Fullpay();
        fp.empty();

        System.out.println("Error resolve");

    }



}

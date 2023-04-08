public class Thwsf {


    void data(){
        try {
            numbers();
        }catch(ArithmeticException e){

        }
    }




    public void numbers() throws ArithmeticException{
        int A = 2/0;

    }


    public static void main(String[] args) throws ArithmeticException {
        Thwsf th = new Thwsf();
        th.data();

    }


}

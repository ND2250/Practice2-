public class Thrws {

    public void sum(){
        try{
            div();
        }catch (ArithmeticException e ){

        }

    }





    public void div() throws ArithmeticException{
        int A = 10/0;
    }



    public static void main(String[] args) throws ArithmeticException {
        Thrws thrws = new Thrws();
        thrws.sum();

    }
}



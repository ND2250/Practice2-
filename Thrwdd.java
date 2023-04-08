public class Thrwdd {


    // non - static method

     void name(){
         try{
             bold ();
         }catch (ArithmeticException e){

         }

    }



    public void bold()throws ArithmeticException{
        int A = 10/0;



    }


    public static void main(String[] args)throws ArithmeticException {
        Thrwdd df = new Thrwdd();
        df.name();

        System.out.println("Solved");

    }

}

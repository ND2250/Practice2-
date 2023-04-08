package keyywrds;

public class Companydata {
    public static void main(String[] args) {

        try {
            int A[] = new int[3];
            A[0] = 200;
            A[1] = 300;
            A[2] = 400;
            A[3] = 500;

            System.out.println(A[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is not correct");
        }catch(Exception e){
            System.out.println("All corrected");
        }finally {
            System.out.println("All details are correct");
        }
    }

}

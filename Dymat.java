public class Dymat {

    public static void main(String[] args) {

        int a[][] = new int[3][3];

        a[0][0] = 100;
        a[0][1] = 200;
        a[0][2] = 300;

        a[1][0] = 300;
        a[1][1] = 400;
        a[1][2] = 500;

        a[2][0] = 500;
        a[2][1] = 600;
        a[2][2] = 700;

        for(int r = 0;r<a.length;r++){
            for (int c = 0;c<a.length;c++ ){
                System.out.print(a [r][c] + " ");
            }
            System.out.println();
        }
    }
}

public class Asrecord {
    public static void main(String[] args) {
        int A[][] = new int[2][2];
        A[0][0] = 110;
        A[0][1] = 220;

        A[1][0] = 220;
        A[1][1] = 330;

        for ( int r = 0;r<A.length;r++){
            for (int c = 0;c< A.length;c++){
                System.out.print(A[r][c] + " ");
            }
            System.out.println();
        }
    }
}

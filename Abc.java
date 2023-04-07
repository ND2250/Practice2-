public class Abc {
    public static void main(String[] args) {
        int A[][] = new int[3][3];

        A[0][0] = 200;
        A[0][1] = 210;
        A[0][2] = 220;

        A[1][0] = 212;
        A[1][1] = 245;
        A[1][2] = 676;

        A[2][0] = 787;
        A[2][1] = 789;
        A[2][2] = 899;

        for(int r = 0;r< A.length;r++){
            for(int c = 0;c< A.length;c++){
                System.out.print(A[r][c]+" ");
            }
            System.out.println();
        }
    }
}

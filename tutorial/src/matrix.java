public class matrix {
    public static void main(String args[])
    {
        int a[][] = new int[][]{{3,1}, {5,4}};
        int b[][] = new int[][]{{7,4}, {2,8}};
        int c[][] = new int [2][2];
        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j< 2; j++)
            {
                c[i][j]= a[i][j] + b[i][j];
                System.out.println("\t" + c[i][j]);
            }
            System.out.println();
        }


    }
}

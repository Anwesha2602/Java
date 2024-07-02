public class DiagonalFlip {
    public static void main(String[] args) {
        int [][] A = {{1,0,2},{1,0,2},{1,0,2}};
        int[][] B = new int[A.length][A.length];
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
               B[i][j]= A[j][i];
            }
        }
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
              System.out.print(B[i][j]);
            }
            System.out.println();
        }
        
    }
}

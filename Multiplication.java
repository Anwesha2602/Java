class Multiplier{
    int c[][]=new int[10][10];
    void mul(int a[][],int c1,int r1,int b[][],int c2,int r2){
     if(c1!=r2){
            System.out.println("Multiplication not possible");
        }
        for(int i=0;i<r1;i++){
            for(int j=0 ; j<c2 ; j++){
                for(int k=0;k<r2;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        
    }
    void show(int a[][],int c1,int r1,int b[][],int c2,int r2){
          System.out.println("Result");
         for(int i=0;i<r1;i++){
            for(int j=0 ; j<c2 ; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

public class Multiplication {
    public static void main(String args[]){
    int col1=3 , row1= 2 , col2 = 2 , row2= 3;
    int a[][] = {
        {1,2,3},
        {4,5,6}
    };
    int b[][] = {
        {1,2},
        {2,3},
        {3,4}
    };
    Multiplier ob1 = new Multiplier();
    ob1.mul(a, col1, row1, b, col2, row2);
    ob1.show(a, col1, row1, b, col2, row2);


}
}
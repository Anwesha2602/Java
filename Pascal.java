class Fact{
    int res(int num){
        if(num==0){
            return 1;
            }
            else{
                return num*res(num-1);
            }
    }
}
public class Pascal {
    public static void main(String[] args) {
        int n=6;
        Fact ob = new Fact();
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
               System.out.print(" ");
            }
            for(int k=0 ;k<=i;k++){
                int res = ob.res(i)/(ob.res(i-k)*ob.res(k));
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}

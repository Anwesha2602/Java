class Neon{
    private int num;

    Neon(int a){
        num=a;
    }
    void check(){
        int t = num;
        int sum=0;
        int sq = num*num;
        while(sq>0){
            int rem = sq%10;
            sum = sum+rem;
            sq=sq/10;
        }   
        if(sum==t){
            System.out.println("Neon Number");
        }
    }

}


public class Neon_Number {
    public static void main(String[] args) {
        Neon ob = new Neon(15);
        ob.check();

    }
}

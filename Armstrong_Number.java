import java.lang.Math;
class Armstrong{

    private int upper,lower;

    Armstrong(int a,int b){
        lower=a;upper=b;
    }
    void calc(){
        for(int i=lower;i<=upper;i++){ 
            int num=i;
            int d=0;
            int og_num=num;
            int t = num;
            while(num>0){
                num=num/10;
                d=d+1;
            }
         //   System.out.println(d);
            num=t;
            double temp=0;
            while(num>0){
                int rem = num%10;
                temp = temp + Math.pow(rem,d);
                num = num / 10;
            }
            if(og_num==temp){
                System.out.println(temp+" "+"Armstrong");
            }
        }
        }
        


}

public class Armstrong_Number {
    public static void main(String[] args) {
    Armstrong ob1 = new Armstrong(50,500);
    ob1.calc();
    }
}

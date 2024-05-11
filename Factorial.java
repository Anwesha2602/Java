class Fact{
    int res=1;
    int res(int num){
        if(num==0){
        //    return res;
        return 1;
        }
        else{
            // res=res*num;
            return num*res(num-1);
        }
    }
}


public class Factorial {
    public static void main(String[] args) {
        Fact ob = new Fact();
        System.out.println(ob.res(6));
    }
}

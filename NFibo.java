import java.util.Scanner;

public class NFibo {
    static int Fibo(int n){
        if (n<=1)
            return n;
        return Fibo(n-1)+Fibo(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n-th term: ");
        int n = sc.nextInt();
        int res = Fibo(n-1);
        System.out.println(res);
    }
}

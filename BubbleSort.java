import java.util.Scanner;

class Sort{
    private int[] a = new int[10];
    private int n;
    Sort(int a[] , int n){
        this.a=a;
        this.n = n;
    }
    void show(){
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    void display(){
        System.out.println("\nSorted array");
        for(int i =0 ; i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
class BubbleSort{
    public static void main(String[] args){
        int n=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        int[] a = new int[n] ;
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Unsorted array");
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        Sort ob = new Sort(a,n);
        ob.show();
        ob.display();
    }
}
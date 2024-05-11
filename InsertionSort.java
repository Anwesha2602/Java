import java.util.Scanner;
class Sort{
     private int[] a = new int[10];
    private int n;
    Sort(int a[] , int n){
        this.a=a;
        this.n = n;
    }
    void show(){
        for(int i=1;i<n;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && key<a[j]){
                a[j+1]=a[j];
                --j;
            }
            a[j+1]=key;
        }
    }
    void display(){
        System.out.println("\nSorted array");
        for(int i =0 ; i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

class InsertionSort {
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

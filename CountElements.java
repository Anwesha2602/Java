import java.util.ArrayList;

public class CountElements {
    public static void main(String[] args) {
        int[] arr ={1,5,5,3,4,1,1,1,1,1,1,1};
        // sort the elements
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j+1]<arr[j]){
                    int t = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // keep count of each element
      // ArrayList<Integer> res = new ArrayList<>();
      
        int count = 1;
        int j=0;
        int[] res = new int[arr.length];
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count=count+1;
            }
            else{
                res[j++] = count;
               //res.add(count);
               count=1;
            }
        }
        // for last element
       // res.add(count);
       res[j] = count;
       System.out.println("\nCount");
        for(int i =0;i<=j;i++)
            System.out.print(res[i]+" ");
    }

}

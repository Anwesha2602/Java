import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Factors {
    public static void main(String[] args) {
        int num = 85463;
        Set<Integer> res = new HashSet<>(); 
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                res.add(i);
                res.add(num/i);
            }
           
        }
        int arr[] = new int[res.size()];
        int idx=0;
        for(int i: res){
            arr[idx++]=i;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

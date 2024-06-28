import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class NonRepeat {
    static void arrayFun(String s){
        int[] freqArray = new int[256];
        for(int i= 0;i<s.length();i++ ){
            freqArray[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freqArray[i]==1){
                System.out.print((char)i+" ");
            }
        }
    }
    static void hashmapFun(String s){
        HashMap<Character,  Integer> charFreq = new HashMap<>();
        ArrayList l = new ArrayList<>();
        for(char freq: s.toCharArray()){
            charFreq.put(freq,charFreq.getOrDefault(freq, 0)+1);
        }
        int c=0;
        for( HashMap.Entry <Character,Integer>entry : charFreq.entrySet()){
            if(entry.getValue()==1){
                c=c+1;
                l.add(entry.getKey());
            }
        }
        System.out.println(l);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        //without hashmap
        System.out.println("Using frequency array");
        arrayFun(s);
        
        //with hashmap
        System.out.println("\nUsing HashMap");
        hashmapFun(s);
    }
}

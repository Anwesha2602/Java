
import java.util.HashMap;

public class SumNonRepeat {
    public static void main(String[] args){
        int N= 1509;int s =0;
        String numberStr = String.valueOf(N);
        HashMap<Character, Integer> digitCount = new HashMap<>();
        
        for (char digit : numberStr.toCharArray()) {
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) +1);
        }
        System.out.println(digitCount);
        for (HashMap.Entry<Character, Integer> entry : digitCount.entrySet()) {
            if (entry.getValue() == 1) {
                s += Character.getNumericValue(entry.getKey());
            }
        }
        System.out.println(s);
}
}

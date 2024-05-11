public class Anagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "carE";
        s1 = s1.toLowerCase();
        s2=s2.toLowerCase();
        // Check if lengths of both strings are equal
        if (s1.length() != s2.length()) {
            System.out.println("nope");
            return;
        }
        
        // Array to store character counts
        int[] char_counts = new int[26];
        
        // Count occurrences of characters in both strings
        for (int i = 0; i < s1.length(); i++) {
            char_counts[s1.charAt(i) - 'a']++;
            char_counts[s2.charAt(i) - 'a']--;
        }
        
        // Check if any character count is non-zero
        for (int count : char_counts) {
            if (count != 0) {
                System.out.println("nope");
                return;
            }
        }
        
        // If all character counts are zero, strings are anagrams
        System.out.println("yes");
    }
}

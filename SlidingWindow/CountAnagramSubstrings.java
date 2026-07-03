package DSA.SlidingWindow;
import java.util.HashMap;
import java.util.Scanner;

public class CountAnagramSubstrings {

    public static int countOccurrence(String s, String p) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int ans = 0;

        // Storing the occurrence of string p in the map
        for (char x : p.toCharArray()) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        int count = mp.size();  // Number of unique characters we need to match
        int k = p.length();     // Window size
        int i = 0, j = 0;

        while (j < s.length()) {
            // Calculation part: process current character at j
            if (mp.containsKey(s.charAt(j))) {
                mp.put(s.charAt(j), mp.get(s.charAt(j)) - 1);
                if (mp.get(s.charAt(j)) == 0) {
                    count--;  // All occurrences of this char are matched
                }
            }

            // Window length not achieved yet
            if (j - i + 1 < k) {
                j++;
            }

            // Window length achieved, find ans and slide the window
            else if (j - i + 1 == k) {
                // Check if current window is an anagram of p
                if (count == 0) {
                    ans++;
                }

                // Slide the window: remove leftmost character
                if (mp.containsKey(s.charAt(i))) {
                    mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
                    if (mp.get(s.charAt(i)) == 1) {
                        count++;  // This character is no longer fully matched
                    }
                }

                // Move window forward
                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();

        System.out.println(countOccurrence(s, p));
        sc.close();
    }
}

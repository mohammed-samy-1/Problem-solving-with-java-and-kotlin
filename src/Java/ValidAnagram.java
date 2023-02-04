package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String s = scanner.nextLine();
        System.out.print("Enter second string : ");
        String s2 = scanner.nextLine();
        scanner.close();
        System.out.println(anagramTest(s, s2));
    }

    /**
     * eg:- input anagram , magaram   output true
     * eg:- input anagram , magarm    output false
     * eg:- input anagram , magarms   output false
     * @param s pass the first string
     * @param s2 pass the second string
     * @return if s and s2 are equal or contain exactly same letters with same number of repetition return true
     * otherwise return false
     */
    private static boolean anagramTest(String s, String s2) {
        if (s.length() == s2.length()) {
            Map<Character, Integer> map = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), 1);
                } else {
                    map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
                if (!map2.containsKey(s2.charAt(i))) {
                    map2.put(s2.charAt(i), 1);
                } else {
                    map2.replace(s2.charAt(i), map2.get(s.charAt(i)) + 1);
                }
            }
            if (map.keySet().size() != map2.size())
                return false;
            for (char c : map.keySet()) {
                if (map2.containsKey(c)) {
                    if (map.get(c).intValue() == map2.get(c).intValue()) {
                        continue;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }
}

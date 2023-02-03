package Java;

import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.print("please enter a string :");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(containsDuplicate(s));

    }

    /**
     * find out if the string contains duplication
     * @param s pass the string you want to test
     * @return true if the string have at least duplicated char
     */
    public static boolean containsDuplicate(String s){
        char[] lettersList = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (containsChar(lettersList, s.charAt(i))){
                return true;
            }
            lettersList[i] = s.charAt(i);
        }
        return false;
    }

    // finds if the char exists in the array
    /**
     *
     * @param arr pass the array you want to find if it contains the char
     * @param c pass the char you want to check on
     * @return returns true if the array (arr) contains the char (c) otherwise false
     */
    public static boolean containsChar(char[] arr, char c){
        for (char value : arr) {
            if (value == c) return true;
        }
        return false;
    }
}

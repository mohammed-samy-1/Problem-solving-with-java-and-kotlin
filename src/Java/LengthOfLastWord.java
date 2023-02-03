package Java;

import java.util.Scanner;

/*
 * problem :  find the length of the last word in a string
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.print("please enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord2(s));
    }

    /**
     * function to find the length of last word in the string
     * @param s pass a string to find length of the last word
     * @return length of last word
     */
    public static int lengthOfLastWord(String s){
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
    // another implementation
    public static int lengthOfLastWord2(String s){
        int len = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)!= ' '){
                len++;
                continue;
            }
            break;
        }
        return len;
    }
}

package lk.ijse;

import java.util.Arrays;

public class TwoNumberAnagram {
    public static void main(String[] args) {
        int i = 234;
        int j = 432;

        String s1 = String.valueOf(i);
        String s2 = String.valueOf(j);

        char[] cr1 = s1.toCharArray();
        char[] cr2 = s2.toCharArray();

        Arrays.sort(cr1);
        Arrays.sort(cr2);

        if (Arrays.equals(cr1,cr2)){
            System.out.println(i + " anagram of " + j);
        }else {
            System.out.println("numbers are not anagrams");
        }


    }
}

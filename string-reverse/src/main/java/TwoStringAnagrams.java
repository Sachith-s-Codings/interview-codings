import java.util.Arrays;

public class TwoStringAnagrams {
    public static void main(String[] args) {
        String s1 = "machaan";
        String s2 = "naahcam";
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1,charArray2)){
            System.out.println(s1 + " is a anagram of " + s2);
        }else {
            System.out.println(s1 + " is not a anagram of " + s2);
        }


    }
}

package lk.ijse;

public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 1221;

        StringBuilder sb = new StringBuilder(String.valueOf(number));
        StringBuilder reverseStringNumber = sb.reverse();
        int reverseNumber = Integer.parseInt(reverseStringNumber.toString());
        System.out.println(reverseNumber);

        if (number != reverseNumber){
            System.out.println(number + " is not a Palindrome");
        }else {
            System.out.println(number + " is a Palindrome");
        }
    }
}

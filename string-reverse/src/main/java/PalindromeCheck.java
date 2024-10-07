public class PalindromeCheck {
    public static void main(String[] args) {
        String s1 = "racecao";
        int i = 0;
        int j = s1.length() - 1;

        while (i < j){
            if (s1.charAt(i) != s1.charAt(j)){
                System.out.println(s1 + " is not a Palindrome");
                return;
            }
            j--;
            i++;
        }
        System.out.println(s1 + " is a Palindrome");
    }
}

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello!";
        StringBuilder sb = new StringBuilder(str);
        String stringReversed = sb.reverse().toString();
        System.out.println(stringReversed);

        String str2 = "sudus";
        String reverse = reverse(str2);
        System.out.println(reverse);


    }
    public static String reverse(String s){
        if (s.isEmpty()){
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

}


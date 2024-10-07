public class StringReverse2 {
    public static void main(String[] args) {
        String str = "sachith ranagana";
        String reverse = reverse(str);
        System.out.println(reverse);
    }
    public static String reverse(String s){
        if (s.isEmpty()){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}

package lk.ijse;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String s = "aananda bawana";
        String finalResult = removeDuplicates(s);
        System.out.println(finalResult);


    }
    public static String removeDuplicates(String string) {

        LinkedHashSet<Character> inputSet = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (inputSet.add(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}

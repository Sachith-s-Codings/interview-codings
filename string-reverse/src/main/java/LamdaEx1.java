import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface myFuncInterface{
    void display(String message);
}
public class LamdaEx1 {
    public static void main(String[] args) {

        myFuncInterface myFunc = (message) ->{System.out.println(message);};
        myFunc.display("hello");

        String[] s = {"puthe", "patto", "cutto"};
        Arrays.stream(s).forEach((sm)->{
            System.out.println(sm);
        });

        List<String> names = new ArrayList<>();
        names.add("Kasun");
        names.add("Supun");
        names.add("Jagath");

        names.forEach((name)->{
            System.out.println(name);
        });
    }

}

interface MyFunctionalInterface {
    void display(String message);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using lambda expression
        MyFunctionalInterface myFunc = (message) -> System.out.println(message);
        myFunc.display("Hello, Lambda!");
    }
}
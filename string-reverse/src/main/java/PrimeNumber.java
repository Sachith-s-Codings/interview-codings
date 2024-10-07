public class PrimeNumber {
    public static void main(String[] args) {
        int x = 20;
        boolean isPrime = false;

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime) {
            System.out.println(x + " is a prime number");
        }else {
            System.out.println(x + " is a not prime number");
        }
    }
}

public class AP {
    public static void main(String[] args) {

        int limit = 50;    // range limit
        int count = 0;

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % 2 == 1) {   // prints alternate primes
                    System.out.print(num + " ");
                }
            }
        }
    }
}

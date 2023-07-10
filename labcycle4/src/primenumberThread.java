public class primenumberThread {
    private int n;
    public primenumberThread(int n)
    {
        this.n=n;
    }
    void runprocessThread()
    {

        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
    private boolean isPrime(int num) {
        if (num <= 1) {
            System.out.println("f");
            return false;

        }
        System.out.println(Math.sqrt(num));
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

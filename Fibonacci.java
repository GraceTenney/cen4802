public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Term " + n + " of the fibonacci sequence is " + fibonacci(n));
    }
    public static int fibonacci(int sequenceNumber) {
        int result = 0, num1 = 0, num2 = 1;
        if(sequenceNumber == 1)
            return 1;
        for(int i = 1; i < sequenceNumber; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
}

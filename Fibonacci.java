public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Term " + n + " of the fibonacci sequence is " + fibonacci(n));
    }
      /**
     * Finds the number at the input number's point of the fibonacci sequence.
     * @param sequenceNumber - Step of the fibonacci sequence to return.
     * @return - Number at that point of the fibonacci sequence.
     */
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

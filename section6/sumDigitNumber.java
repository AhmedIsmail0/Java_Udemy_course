public class sumDigitNumber {
    public static void main(String[] args) {
        System.out.println("the sum of the digits = " + sumDigits(1234 ));
        System.out.println("the sum of the digits = " + sumDigits(4 ));
        System.out.println("the sum of the digits = " + sumDigits(-125 ));
        System.out.println("the sum of the digits = " + sumDigits( 32123));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int remSum = 0;
        while (number > 0) {
            int rem = number % 10;
            remSum += rem;
            number = number / 10;
        }
        return remSum;
    }
}

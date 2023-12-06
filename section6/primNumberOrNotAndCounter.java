public class primNumberOrNotAndCounter {
    public static void main(String[] args) {
      // System.out.println("0 is " + (isPrime(0)? "" : "not ") +"a prime number " );
      // System.out.println("1 is " + (isPrime(1)? "" : "not ") +"a prime number " );
        int count = 1;
        for (int num = 0; num <= 1000; num++){
            if (!isPrime(num)){
                System.out.println(num + " is NOT a prime number ");
            }
            else if (isPrime(num)) {
                System.out.println(num + " is a prime number and Counter is " + count );
                count += 1;
                // System.out.println(count);
            }
            if (count == 100){
                System.out.println("counter is 100 ---> EXITING THE LOOP");   // EXIT the code if you get 100 prime number
                break;
            }
        }
        //System.out.println(count);
    }
    public static boolean isPrime (int number){
        if (number < 2 ){
            return false;
        }else{
            for(int i = 2; i <= number/2; i++ ){
                if (number % i == 0){
                    return false;
                }
            }return true;
        }
    }
}

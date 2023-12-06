public class forChallenge {
    public static void main(String[] args) {


        for (double i = 7.5; i <= 10; i += 0.25) {
           // System.out.println(calculateInterest(100,i));
            System.out.println(calculateInterest(200,i));
        }
    }
    public static double calculateInterest (double dollar, double rate){
         return (dollar * (rate / 100)) ;
    }
}

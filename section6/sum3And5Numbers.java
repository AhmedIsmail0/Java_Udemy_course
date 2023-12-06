public class sum3And5Numbers {
    public static void main(String[] args) {
        int count = 0 , sum = 0;
        for(int num = 1; count < 5 && num <= 1000; num++){
           if (num % 3 == 0 && num % 5 == 0){
               System.out.println( num + "is able to division by 3 and 5 ");
               count++;
               sum += num;
           }
        }System.out.println("Counter equal " + count + "---> EXITING THE LOOP");
        System.out.println("Sumition of these numbers equal " + sum);
    }
}

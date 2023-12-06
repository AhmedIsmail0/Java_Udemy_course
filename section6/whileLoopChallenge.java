public class whileLoopChallenge {
    public static void main(String[] args) {
        int number = 4;
        int evenCount = 0;
        int oddCount = 0;
        while(number <= 20){
            number ++;
            if(!isEvenNumber(number)){
                System.out.println(number + " is Odd number");
                oddCount++;
                   continue;
            }
            System.out.println(number + " is Even number");
            evenCount++;
          //     if(evenCount == 5){break;}           //EXISIT AFTER COUNT = 5

        }
        System.out.println("total even number found equal " + evenCount);
        System.out.println("total odd number found equal " + oddCount);
    }
    public static boolean isEvenNumber (int num){
        if (num % 2 == 0){
            return true;
        }else return false;
    }
}

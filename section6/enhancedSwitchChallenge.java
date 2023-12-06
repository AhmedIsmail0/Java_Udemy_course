public class enhancedSwitchChallenge {
    public static void main(String[] args) {
        printDayOfWeek(5);
    }
    public static void printDayOfWeek(int day){
       String dayOfWeek =  switch (day){
            case 0 -> "Sunday";
      //    case 1 -> "Monday";
            case 1 -> {yield "Monday";}    // ANOTHER methode to do line 8
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "not valid";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
}

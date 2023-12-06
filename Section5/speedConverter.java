
public class speedConverter {
    public static void main(String[]args){
           printConversion(407.750);
    }
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0 ){
            return -1 ;
        }
            double milesPerHour = kilometersPerHour / 1.609;
            long rounded = Math.round(milesPerHour);
            return rounded;
            // return Math.round(kilometerPerHour / 1.609);  correct also
    }
    public static void printConversion (double kilometersPerHour){
        if (kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
            return;
        }
        else {
            //double milesPerHour = kilometersPerHour / 1.609;
            long milesPerHour = toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + "mi /h");
        }
    }
}

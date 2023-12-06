public class convertToCentimeter {
    public static void main(String[] args) {
        convertToCentimeter(10);
        convertToCentimeter(5,8);
    }
    public static double convertToCentimeter(int inches) {
        // INCHES TO CENTIMETER
        double centimeter = (double) (inches * 2.54);
        System.out.println("Height in centimeters = " + centimeter + "cm");
        return centimeter;
      // return inches * 2.54;
    }
    public static double convertToCentimeter(int feet, int remainingInches){
        // CONVERT FEET AND INCHES TO INCHES
        int heightInInches =  ((feet * 12) + remainingInches );
        System.out.println("Height in inches = " + heightInInches + "inche");
        convertToCentimeter(heightInInches);
       // System.out.println("Height2 in centimeters = " + cm + "cm");
       return 0;
    }

}

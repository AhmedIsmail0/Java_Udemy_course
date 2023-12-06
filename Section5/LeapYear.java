public class LeapYear {
        // write code here
        public static void main(String[] args) {
            System.out.println("Is year 2020 a leap year? " + isLeapYear(2020));
            System.out.println("Is year 2023 a leap year? " + isLeapYear(2023));
        }
        public static boolean isLeapYear (int year){
            if (year >= 1 && year <= 9999){
                if ((year % 4 == 0) && (year % 100 != 0)){
                    return true;
                }if ((year % 100 == 0) && (year % 400 == 0)){
                    return true ;
                }else return false;  // not a leap year
            }else return false;      // not in the rang from 1 to 9999
        }
    }


class Tester {
    
   public static int[] findLeapYears(int year){
       int[] leapYears = new int[15];
       int index = 0;
       
       while (index < 15) {
           if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
               // If it's a leap year, add it to the array
               leapYears[index] = year;
               index++;
           }
           year++;
       }
       return leapYears;
   }
    
   public static void main(String[] args) {
       int year = 2001;
       int[] leapYears = findLeapYears(year);
       
       // Print the leap years
       for (int leapYear : leapYears) {
           System.out.println(leapYear);
       }
   }
} 

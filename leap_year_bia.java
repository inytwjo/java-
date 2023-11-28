import java.util.Scanner;
       public class leap_year_bia {
         public static void main(String[] args) {
          
         Scanner b = new Scanner(System.in);

         System.out.println("Input your birthyear: ");
         int birthyear = b.nextInt();

         boolean leap = ((birthyear % 4 == 0) && (birthyear % 100 != 0)) || (birthyear % 400 == 0);
         
         System.out.println("Your birthyear is a Leapyear: " +leap);
    
         }
}
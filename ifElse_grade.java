import java.util.Scanner;
       public class ifElse_grade {
         public static void main(String[]args) {

         Scanner b = new Scanner(System.in);

	 System.out.println("Enter your Grade: ");
         int grade = b.nextInt();

         if (grade >= 95 && grade <=100){
         System.out.println("4");

	} else if(grade >= 90 && grade <=94){
         System.out.println("3.5");

        } else if(grade >= 85 && grade <=89)
         System.out.println("3");

         }
}






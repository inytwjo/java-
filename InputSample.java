import java.util.Scanner;
       public class InputSample {
              public static void main(String[] args) {

       Scanner x = new Scanner(System.in);

       System.out.print("What is your name: ");
       String name = x.nextLine();

       System.out.print("Input your age: ");
       int age = x.nextInt();
 
       System.out.println("When is your birthday: ");
       String birthday = x.nextLine();

       System.out.print("What is your address: ");
       String address = x.nextLine();

       System.out.println("Name: "+name);
       System.out.println("Age: "+age);
	System.out.println("Birthday: "+birthday);
       System.out.println("Address: "+address);
       
       }
}

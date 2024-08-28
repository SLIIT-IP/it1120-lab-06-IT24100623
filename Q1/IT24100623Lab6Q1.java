import java.util.Scanner;

 public class IT24100623Lab6Q1 {

   public static void main (String[]args) {

   Scanner input=new Scanner (System.in);

   System.out.print("Enter a number: ");
   double number=input.nextDouble();

   double square=number*number;
   double squareroot=Math.sqrt(number);
   
   System.out.println("The square of 25.0 is : "+square);
   System.out.println("The squareroot of 25.0 is : "+squareroot);

  }
}
   
   
   


import java.util.Scanner;
public class Session1Assignment3
{
    public static void main(String [] args) 
    {

       Scanner sc = new Scanner(System.in);      
       int num1, num2;
     
       System.out.print("Enter the first number: ");
       num1 = sc.nextInt();
       System.out.print("Enter the second number: ");
       num2 = sc.nextInt();     
       System.out.println("\nNumbers Before Swapping:");
       System.out.println("Num1 = "+num1);
       System.out.println("Num2 = "+num2);            
       num1 = num1 + num2;
       num2 = num1 - num2;
       num1 = num1 - num2;
 
       System.out.println("\nNumbers After Swapping:");
       System.out.println("Num1 = "+num1);
       System.out.println("Num2 = "+num2);


    }
}
        
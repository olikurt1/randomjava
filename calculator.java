import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------BEGIN-------------");
       
        /*First Number */
        System.out.print("");
        int firstNumber = input.nextInt();

        /*Second number */
        System.out.print("");
        int secondNumber = input.nextInt();
        /*simple arithmetic of all numbers straight away */
        System.out.println("The sum of your two numbers are: "+ (firstNumber+secondNumber));
        System.out.println("The subtraction of your two numbers are: "+ (firstNumber-secondNumber));
        System.out.println("The product of your two numbers are: "+ (firstNumber*secondNumber));
        System.out.println("The division of your two numbers are: "+ (firstNumber/secondNumber));
    }
}

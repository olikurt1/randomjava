import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------BEGIN-------------");
       
        /*First Number */
        System.out.print("");
        int firstNumber = input.nextInt();

        /*flushes the previous input */
        input.nextLine();

        System.out.print("");
        String operator = input.nextLine();

        /*Second number */
        System.out.print("");
        int secondNumber = input.nextInt();

        switch(operator){
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;

            case "*":
                System.out.println(firstNumber * secondNumber);
                break;

            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
        }
    }
}

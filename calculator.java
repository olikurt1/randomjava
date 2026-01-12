import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------BEGIN-------------");
       
        
        System.out.print("");
        String calculation = input.nextLine();
        /*Have to have an end index if there are further numbers/texts */
        String strNum1 = calculation.substring(0,1);
        String operator = calculation.substring(1,2);
        String strNum2 = calculation.substring(2);

        

        int firstNumber = Integer.parseInt(strNum1);
        int secondNumber = Integer.parseInt(strNum2);

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
            default:
                System.out.println("Incorrect Input");
                break;
        }
    }
}

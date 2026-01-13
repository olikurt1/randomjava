import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] computerChoices = {"rock", "paper", "scissors"};
        Random random =  new Random();
        int randomIndex = random.nextInt(3);

        String computerChoice = computerChoices[randomIndex];
        System.out.print("Enter your choice, (r)ock, (p)aper, (s)cissors: ");
        String userChoice = input.nextLine();     
        
        if(userChoice == "r"){
            switch(computerChoice){
                case "rock":
                    System.out.println("Its a draw");
                    
                case "paper":
                    System.out.println("Computer wins");
                    break;
                case "scissors":
                    System.out.println("User wins");
                    break;
            }
        }
        else if(userChoice == "s"){
            switch(computerChoice){
                case "scissors":
                    System.out.println("Its a draw");
                    break;
                case "paper":
                    System.out.println("User wins");
                    break;
                case "rock":
                    System.out.println("Computer wins");
                    break;
            }
        }
        else if(userChoice == "p"){
            switch(computerChoice){
                case "paper":
                    System.out.println("Its a draw");
                    break;
                case "scissors":
                    System.out.println("Computer wins");
                    break;   
                case "rock":
                    System.out.println("User wins");
                    break;
            }
        }
        System.out.println("Computers choice was: "+computerChoice);
    }
}

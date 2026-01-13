import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random =  new Random();
        int userScore = 0;
        int computerScore = 0;

        System.out.println("How many rounds would you like to play: ");
        int rounds = input.nextInt();
        input.nextLine();

        for(int round = 0; round < rounds; round++){
            String[] computerChoices = {"rock", "paper", "scissors"};
            
            
            int randomIndex = random.nextInt(3);

            String computerChoice = computerChoices[randomIndex];
            
            System.out.print("Enter your choice, (r)ock, (p)aper, (s)cissors: ");
            String userChoice = input.nextLine();
            
            
            
        
            if(userChoice.equals("r")){
                switch(computerChoice){
                    case "rock":
                        System.out.println("Its a draw");
                        break;
                    case "paper":
                        System.out.println("Computer wins");
                        computerScore += 1;
                        break;
                    case "scissors":
                        System.out.println("User wins");
                        userScore += 1;
                        break;
                }
            }
            else if(userChoice.equals("s")){
                switch(computerChoice){
                    case "scissors":
                        System.out.println("Its a draw");
                        break;
                    case "paper":
                        System.out.println("User wins");
                        userScore += 1;
                        break;
                    case "rock":
                        System.out.println("Computer wins");
                        computerScore += 1;
                        break;
                }
            }
            else if(userChoice.equals("p")){
                switch(computerChoice){
                    case "paper":
                        System.out.println("Its a draw");
                        break;
                    case "scissors":
                        System.out.println("Computer wins");
                        computerScore += 1;
                        break;
                           
                    case "rock":
                        System.out.println("User wins");
                        userScore += 1;
                        break;
                }
            }
            System.out.println("Computers choice was: "+computerChoice);
        }
        System.out.println("User score was: "+ userScore);
        System.out.println("Computer score was: "+ computerScore);
        
        if(userScore > computerScore){
            System.out.println("User wins game!");
        }
        else if(computerScore > userScore){
            System.out.println("Computer wins game!");
        }
        else{
            System.out.println("DRAW!!");
        }
        input.close();
        
    }
}

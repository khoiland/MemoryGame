package memorygame;

import java.util.Scanner;

/**
 *
 * @author Kellie
 */
public class MemoryGame {
  
    // Instance Variables
    String players;
    String name;
    String instructions = "This is a Memory Game \n\n"
            + "The object of the game is to match the math fact cards with \n"
            + "their corresponding answers, or vice versa.\n"
            + "This is a 1 to 4 player game.\n"
            + "Choose from 4 different levels of difficulty: Beginner,\n"
            + "Intermediate, Advanced, and Expert.\n"
            + "Beginner: Elementary math (addition, subtraction, mulitplication,\n"
            + "division).\n"
            + "Intermediate: Middle school math (pre-algebra).\n"
            + "Advanced: High school math (algebra, geometry, trigonometry).\n"
            + "Expert: College math (calculus).\n"
            + "Test your math skills and your memory!";
         
    public static void main(String[] args) {
        MemoryGame myGame = new MemoryGame();
        myGame.getName();
        myGame.displayHelp();
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name(s): ");            
        this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
    }
}

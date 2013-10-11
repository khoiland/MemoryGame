/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

import java.util.Scanner;

      
/**
 *
 * @author Kellie/Melanie
 */
public class MemoryGame {
        String name;
        String instructions; // instructions
        String players; // number of players
        String level;
        
      
 public MemoryGame(){
 }
 
public static void main(String[] args) {
        MemoryGame myGame = new MemoryGame();
       
        // get the number of players
        myGame.getPlayers();
        
        // get the name of the players
        myGame.getName();
        
        // display the instructions
        myGame.displayInstructions(); 
        
        // choose game level
        myGame.gameLevel();
    /**
     *
     */

    public void getPlayers(){
         Scanner input = new Scanner(System.in);
         
         //asks users for the number of players
         System.out.println("Enter Number of Players: ");
         this.players = input.next();         
    }

    public void getName() {
        // get the users names
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your names(s): ");
        this.name = input.nextLine();
        
        // welcomes users to the game
        System.out.println("\n\t\t\t*Welcome " + this.name +"!*\n");
    }
    
    public void displayInstructions() {
        // comes form class instructions
        Instructions Instructions = new Instructions();
        Instructions.displayInstructions();       
    }
    
    public void gameLevel(){
        Scanner input = new Scanner(System.in);
        
        // asks user what difficulty level they wish to play
        System.out.println(" Please select a level: "
                + "\n [e] for Easy (basic math operations)"
                + "\n [i] for Intermediate (pre-algebra)"
                + "\n [a] for Advanced (algebra and trigonometry)"
                + "\n [x] for Expert (calculus)");
        this.level = input.next();
        
        // initial code to print out game board depending on 
        // game leve chosen
        // NOT CONNECTED 
        
        //if (level = e)
          //  System.out.prinln(Easy);
            
        //else if (level = i)
          //  System.out.println(Intermediate);
        
        //else if (level = a)
          //  System.out.println(Advanced);
        
        //else if (level = x)
          //  System.out.println(Expert);
                
    }
    
    
}


        

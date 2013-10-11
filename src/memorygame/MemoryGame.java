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
        String name; //first name
        String instructions; // instructions
        String players; // number of players
        
 public MemoryGame(){
 }
 
public static void main(String[] args) {
        MemoryGame myGame = new MemoryGame();
        myGame.getName();
        myGame.getNumberofPlayers();
           
    /**
     *
     */
    public void getNumberofPlayers(){
         Scanner input;
            input = new Scanner(System.in);
         System.out.println("Enter Number of Players");
         this.players=input.next();       
       
    }

    private void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");            
        this.name = input.next();
    }

    private void displayHelp() {
        Instructions Instructions = new Instructions();
        Instructions.displayInstructions();
        
}
}

        

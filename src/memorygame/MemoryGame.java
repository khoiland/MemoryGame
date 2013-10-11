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
     
        myGame.displayHelp();
        Instructions instructions = new Instructions();
        instructions.displayInstructions();
        
        
        getnumberplayers players = new getnumberplayers();
        players.displayPlayers(); 
       
      }
      
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");            
        this.name = input.next();
    }
 
    public void displayHelp() {
        System.out.println("\n\t\t\t\t* Welcome " + this.name + "! *\n");
    }
    }


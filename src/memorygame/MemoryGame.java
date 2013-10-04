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
        String age; // age of player
        String instructions = "The goal of the game: At the end of the game, \"n\n"
        + "everyone adds up the number of match. Each match is worth one \n" 
        + "point. The person with the most matches is the winner.\n"
        + "GoodLuck!!!\n\n";
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MemoryGame myGame = new MemoryGame();
        myGame.getName();
        myGame.getage();
        myGame.displayHelp();
    }
    
      public void getage() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age: ");
        this.age = input.next();
      }
      
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");            
        this.name = input.next();
    }
                  
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println("\nSo your age is: " + this.age + "\n");
        System.out.println(this.instructions);
    }
    }


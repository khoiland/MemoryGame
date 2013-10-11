/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

/**
 *
 * @author Kellie
 */
public class Instructions {
    
    
    public Instructions() {
    }

public void displayInstructions () {

    String instructions = 
          "\n\t***********************************************************************"
        + "\n\t* Welcome to Memory Game!                                             *"                            
        + "\n\t* The goal of the game is choose a card and match the coresponding    *"
        + "\n\t* math facts with their answers.                                      *"
        + "\n\t* Practice or test your math skills!                                  *"  
        + "\n\t* Good luck!                                                          *"
        + "\n\t***********************************************************************"
        + "\n";
    
    System.out.println(instructions);
}

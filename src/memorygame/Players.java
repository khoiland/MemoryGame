/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kellie
 */
public class Players {
   
    public Players(){
    }
    
    //public void getPlayers(){
        //String numPlayers = "\n\t Please enter the number of players:\n";
        //System.out.println(numPlayers);            
        //this.numPlayers = input.next();
        	
private void getnumberplayers(char choice) throws IOException {
  Scanner input = new Scanner (System.in);
  System.out.println("Please enter the number of players\n"
          + "Choose 1 - 4 ");
  choice = (char) System.in.read();
    }
    
}

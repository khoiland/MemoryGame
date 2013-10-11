/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

import java.util.Scanner;

/**
 *
 * @author Kellie
 */
public class Game {
    private boolean images;
      
    {
       char images;
       char cards;
       char inputCategory;
       Scanner keyInput=new Scanner(System.in);
       System.out.print("Enter a Category:(E=Elementary, "+
               "M=Middle School, C=College, Q=Quit):");
       inputCategory=keyInput.next().charAt(0);
       
       while (inputCategory != 'Q');
       {
         System.out.println(this.images);
           
           
       
   }

   
    }
}


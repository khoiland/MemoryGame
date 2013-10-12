/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

/**
 *
 * @author Kellie
 */
public class Advanced {
    
    int number;
  
    double x = Math.random() * Math.PI;
    
    // make board 6 x 6
    int[][] Table = new int [6][6];
    
    int answer;
    
    char identity;
    char angle;
    char identitymatch;
    
    public Advanced(){
        
        number = 0;
        
        for(int j = 0; j <= 4; j++)
           for(int i = 0; i <= 4; i++)
               Table[i][j] = (j+1) * (i+1);
    }
    public void Problem(String operand){
        switch (operand){
            case "Math.cos()":
                answer = (int) Math.cos(x);
                break;
            case "Math.sin()":
                answer = (int) Math.sin(x);
                break;
            case "Math.tan()":
                answer = (int) Math.tan(x);
                break;
        }    
        //if (angle = "o/h"){
            //identity = "sin(x)";
        //}
        //else if (angle = "a/h"){
           // identity = "cos(x)";
        //}
       // else if (angle = "o/a"){
           // identity = "tan(x)";
        //}
            
        }
        
    }


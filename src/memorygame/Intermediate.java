/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

/**
 *
 * @author Kellie
 */
public class Intermediate {
    
    int number;
    
    int randNumber1;
    int randNumber2;
    
    // make board 6 x 6
    int[][] Table = new int [6][6];
    
    double x = Math.random();
    
    int answer;
    
    public Intermediate(){
        
        number = 0;
        
        for(int j = 0; j <= 5; j++)
            for(int i = 0; i <= 5; i++)
                Table[i][j] = (j+1) * (i+1);
    }
    
    public void Problem(String operand){
        switch (operand) {
            case "*":
                randNumber1 = (int)(Math.random()) * 6 + 1;
                randNumber2 = (int)(Math.random()) * 6 + 1;
                break;
            case "/":
                randNumber2 = (int)(Math.random()) * 6 + 1;
                randNumber1 = Table[randNumber2 - 1][(int)(Math.random() *6)];
                break;
        }
                
                // create math operations
                switch (operand){
                    case "+":
                        answer = (int) ((randNumber1 * x) + (x / randNumber2));
                        break;
                    case "-":
                        answer = (int) ((x / randNumber1) - (randNumber2 * x));
                        break;
                }
        }
        /**
     *
     * @return
     */
    public int getAnswer(){
            return answer;
        }
    }

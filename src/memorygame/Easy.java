/*
 * This class contains all the easy easy math facts for the cards of the program
 */
package memorygame;

/**
 *
 * @author Kellie
 */
public class Easy {
    
    int number;
    
    int randNumber1;
    int randNumber2;
    
    // make board 6 x 6
    int[][] Table = new int [6][6];
    
    int answer;
    
    public Easy(){
        
        number = 0;
        
        for(int j = 0; j <= 5; j++)
            for(int i = 0; i <= 5; i++)
                Table[i][j] = (j+1) * (i+1);
    }
    public void Problem(String operand){
        switch (operand) {
            case "+":
            case "-":
            case "*":
                randNumber1 = (int)(Math.random()) * 6 + 1;
                randNumber2 = (int)(Math.random()) * 6 + 1;
                break;
            case "/":
                randNumber2 = (int)(Math.random()) * 6 + 1;
                randNumber1 = Table[randNumber2 - 1][(int)(Math.random() * 6)];
                break;
        }
        // create math operations randomly
        switch (operand) {
            case "+":
                answer = randNumber1 + randNumber2;
                break;
            case "-":
                answer = randNumber1 - randNumber2;
                break;
            case "*":
                answer = randNumber1 * randNumber2;
                break;
            case "/":
                answer = randNumber1 / randNumber2;
                break;
        }
        }
    public int getAnswer(){
        return answer;
    }
}

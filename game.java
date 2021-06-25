/**
 * This is the main code for the game
 *
 * Juan Coetzee
 * 9/06/2021
 */
import java.util.Scanner;

public class game
{
    Scanner keyboard = new Scanner(System.in);
    String currentgrid [] [] = new String [10] [10];
    String futuregrid [] [] = new String [10] [10];
    String winput;
    public game (){
        //On Start up
        System.out.print('\u000c');
        for (int x = 0; x < 10; x++){
            for (int y = 0; y < 10; y++)
               //System.out.print
                currentgrid [x] [y] = "x ";
            //System.out.println();
        }
        
        while (true){
            winput=keyboard.nextLine();
            printgrid();
            //Word commands
            if (winput.equals("help")){
                System.out.println ("Type input to add the co-ordinates.Type grid to see the grid, and type clear to remove everything off screen");
            } else if (winput.equals("author")){
                System.out.println("Juan Coetzee");
            } else if (winput.equals("toggle")){
                toggle(); 
            } else if (winput.equals("grid")){
                printgrid();
            } else if (winput.equals("clear")){
                System.out.print('\u000c');
            }
            int ninput; 
            //The grid
            currentgrid [0] [0] = "x";
            int newgrid [] [] = new int [10] [10];
            
            for (int i = 0; i < 10;i++){
                for (int j = 0; j < 10; j++){
                    switch (countit(i,j)){
                        //case 2: futuregrid[i,j] = current[i,j];
                        case 2: futuregrid [i] [j] = currentgrid [i] [j];
                        break;
                        case 3: futuregrid [i] [j] = "K";
                        break;
                        default: futuregrid [i] [j] = "x";
                    } // switch
                } // for j
            } // for i
        }//while
    } //constructor
    
    int  countit(int x, int y){
        int total = 0;
        for ( int i = x - 1; i < x + 1; i++) {
            for (int j = y - 1; j < y + 1; j++){
                if ( i > 0 && i < 10 && j < 10 && j > 0){
                    if (currentgrid[x][y].equals("L")){
                        total ++;
                    } // comapar value
                } // not corner
            }// j loop
        } // i loop
        return total;
    }
    
    void toggle(){
        System.out.println("give x co-ordinate");
        int ninput = keyboard.nextInt();
        int x = ninput;
        
        System.out.println("give y co-ordinate");
        ninput = keyboard.nextInt();
        int y = ninput;
        
        currentgrid[x][y] = ".";
    }
    
    void printgrid(){
        for (int x = 0; x < 10; x++){
                for (int y = 0; y < 10; y++)
                //System.out.print
                    System.out.print(currentgrid [x] [y]);
                System.out.println();
            }
    }
}//2222
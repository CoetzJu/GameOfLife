/**
 * This is the main code for the game
 *
 * Juan Coetzee
 * 9/06/2021
 */
import java.util.Scanner;
public class game
{
    String currentgrid [] [] = new String [10] [10];
    String futuregrid [] [] = new String [10] [10];
    String winput;
    public game (){
        //On Start up
        Scanner  keyboard = new Scanner(System.in);
        System.out.print('\u000c');
        while (true){
            winput=keyboard.nextLine();
            //Word commands
            if (winput.equals("help")){
                System.out.println ("Write the coordinates of the cell you want change i.e  4,5 (x,y)");
            } else if (winput.equals("author")){
                System.out.println("Juan Coetzee");
            } else if (winput.equals("toggle")){
                toggle(); 
            }
            int ninput; 
            //The grid
            currentgrid [0] [0] = "x";
            int newgrid [] [] = new int [10] [10];
            for (int x = 0; x < 10; x++){
                for (int y = 0; y < 10; y++)
                //System.out.print
                    currentgrid [x] [y] = "x ";
                //System.out.println();
            }
            for (int x = 0; x < 10; x++){
                for (int y = 0; y < 10; y++)
                //System.out.print
                    System.out.print(currentgrid [x] [y]);
                System.out.println();
            }
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
        
    }
}
import java.util.Arrays;

public class TwoDArraysIntro {
    public static void main(String[] args) {
        String[] xox = {"x","o","x","o","x"};
        System.out.println(Arrays.toString(xox));
        //a 1D array prints a horizontal string
        
        String[][] arr2D = new String[5][4];
        System.out.println("The height is " + arr2D.length); //5 rows
        System.out.println("The width is " + arr2D[0].length); //4 columns. This is basically first row with 4 columns.
        
        for (int row = 0; row < arr2D.length; row++) {
            //populate with coordinates
            for (int col = 0; col<arr2D[row].length; col++) {
                arr2D[row][col] = "(" + row + ", " + col + ")";
            }
        }
        
        //print the 2D array
        //Every element is a 2D array IS itself ana rray
        //so a for loop looks like this
        
        for(String[] row: arr2D) {
            System.out.println(Arrays.toString(row));
        }
    }
}

// Matteo Thomasson
// 11/04/2026
// Prints different patterns using multiple different loops.

public class Patterns {
    // precondition is to make rows a positive number
    //postcondition is to make sure it prints rows of stars in a pattern
    public static void stars(int rows) {
        // starts the first row
        int i = 1;

        while (i <= rows) {
            int j = 1;
            
            // prints the right number of stars
            while (j <= (i * 2 - 1)) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }
    
    // precondition is that the rows are a positive number
    // postcondition is that it prints the numbers repeated in its row number of times
    public static void triangle(int rows) {
        int i = 1;

        while (i <= rows) {
            int j = 1;
            // prints the current row number
            do {
                System.out.print(i);
                j++;
            } while (j <= i);
            
            System.out.println();
            i++;
        }
    }
    
    // precondition is that start is a positive number
    // postcondition is that it prints odd numbers in a decreasing pattern
    public static void odds(int start) {
        if (start % 2 == 0) {
            start--;
        }

        // go down 2 to get the next odd number
        for (int i = start; i >= 1; i -= 2) {

            // print the number as many times as its value
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            

            System.out.println();
        }
    }

    // precondition is that maxE is a positive number
    // postcondition is that it prints an increase + a decreasing pattern of e and o
    public static void eo(int maxE) {
        char letter;

        // choose the starting letter
        if(maxE % 2 == 0) {
            letter = 'O';
        } else {
            letter = 'E';
        }

        int i = 1;

        // print the increasing part of the pattern
        while (i <= maxE) {
            int j = 1;

            while (j <= i) {
                System.out.print(letter);
                j++;
            }

            System.out.println();

            // switch between the e and o
            if (letter == 'O') {
                letter = 'E';
            } else {
                letter = 'O';
            }

            i++;
        }

        // start printing decreasing part
        i = maxE - 1;

        while (i >= 1) {
            int j = 1;

            while (j <= i) {
                System.out.print(letter);
                j++;
            }

            System.out.println();

            if (letter == 'O') {
                letter = 'E';
            } else {
                letter = 'O';
            }

            i--;
        }
    }
    
    // precondition is that rows is a positive number
    // postcondition is that it prints an upsidedown pyramid of the numbers
    public static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * (rows - i) + 1); j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
public static void main(String[] args) {
    stars(7);
    triangle(9);
    odds(9);
    eo(6);
    pyramid(5);
}
}

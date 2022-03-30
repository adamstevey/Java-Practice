import java.util.Scanner;

public class ExerciseMethods {
    public static void wordLengths(Scanner input) {
        int[] counts = new int[81];
        while (input.hasNext()) {
            String word = input.next();
            counts[word.length()] ++;
        }
        for (int j = 1; j < counts.length; j++) {
            if (counts[j] > 0) {
                System.out.print(j+ ": " + counts[j]);
                System.out.print("\t");
                for (int k = 0; k < counts[j]; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
     }
}
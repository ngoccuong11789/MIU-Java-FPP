package Lesson12.Problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = -1 ;

        while (true) {
            try {
                System.out.println("Enter a score (0-100)");
                score = scanner.nextInt();

                if (score < 0 || score > 100) {
                    throw new UnsupportedOperationException("Score must be between 0 and 100");
                }
                System.out.println("break");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            } catch (UnsupportedOperationException e) {
                System.out.println("UnsupportedOperationException" + e.getMessage());
            }
        }
        System.out.println("You entered a valid score : " + score);
        scanner.close();


    }
}

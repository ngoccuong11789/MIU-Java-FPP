package Lesson2;

import java.util.Objects;
import java.util.Scanner;

public class Ls2_Prog5 {
    public static void main(String[] args) {

        //boolean exit = false;
        while (true) {
            System.out.println(STR."Enter C for Circle\n" +
                    "Enter R for Rectangle\n" +
                    "Enter T for Triangle");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            System.out.println("User input : " + userInput);
            switch (userInput) {
                case "C" :
                    System.out.println("Enter the radius of the Circle ");
                    String userInputRadius = scanner.nextLine();
                    Circle circle = new Circle(Double.parseDouble(userInputRadius));
                    System.out.println("The area of a circle is: " + circle.computeArea());
                    break;
                case "R" :
                    System.out.println("Enter the width of the Rectangle ");
                    String userInputWidth = scanner.nextLine();
                    System.out.println("Enter the height of the Rectangle ");
                    String userInputHeightOfRectangle = scanner.nextLine();
                    Rectangle r = new Rectangle(Double.parseDouble(userInputHeightOfRectangle), Double.parseDouble(userInputWidth));
                    System.out.println("The area of Rectangle is: " + r.computeArea());
                    break;
                case "T":
                    System.out.println("Enter the base of the Triangle ");
                    String userInputBase = scanner.nextLine();
                    System.out.println("Enter the height of the Triangle ");
                    String userInputHeightOfTriangle = scanner.nextLine();
                    Triangle triangle = new Triangle(Double.parseDouble(userInputBase), Double.parseDouble(userInputHeightOfTriangle));
                    System.out.println("The area of Triangle is: " + triangle.computeArea());
                    break;
                default:
                    System.out.println("Please enter correct charactor");
            }
            System.out.println("Do you want to continue(y/n) :");
            String userInputNext = scanner.nextLine();
            System.out.println("user input here : " + userInputNext);
            if (userInputNext.equals("n")) {
                //System.out.println("hello");
                break;
            }

        }

    }
}

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Area Calculator!");
        do{
            System.out.println("Please select a shape: ");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Exit");
            System.out.print("Your choice is: ");
            choice = getIntInput(scanner);

            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the circle: ");
                    double radius = getDoubleInput(scanner);
                    double circleArea = calculateCircleArea(radius);
                    System.out.println("The area of the circle is: " + circleArea);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Enter the side length of the square: ");
                    double sideLength = getDoubleInput(scanner);
                    double squareArea = calculateSquareArea(sideLength);
                    System.out.println("The area of the square is: " + squareArea);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Enter the length of the rectangle: ");
                    double length = getDoubleInput(scanner);
                    System.out.println("Enter the width of the rectangle: ");
                    double width = getDoubleInput(scanner);
                    double rectangleArea = calculateRectangleArea(length, width);
                    System.out.println("The area of the rectangle is: " + rectangleArea);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Thanks fro using the calculator");
                    System.out.println(" ");
                    break;


                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println(" ");
            }
        }while(choice != 4);
        scanner.close();
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateSquareArea(double sideLength) {
        return Math.pow(sideLength, 2);
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static int getIntInput(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print("");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
        return input;
    }

    public static double getDoubleInput(Scanner scanner) {
        double input;
        while (true) {
            try {
                input = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.print("");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
        return input;
    }
}
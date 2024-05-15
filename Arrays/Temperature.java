package Arrays;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter the number of temperatures: ");
        int numTemp = scanner.nextInt();

        // Prompt the user to enter all the 8 numbers
        System.out.println("Enter " + numTemp + " temperatures: ");
        double[] temperatures = new double[numTemp];
        double sum = 0;
        for (int i = 0; i < numTemp; i++) {
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];
        }

        // Calculate the average temperature
        double averageTemp = (double) sum / numTemp;

        // Calculate the number of temperatures above average
        int aboveAverage = 0;
        for(double temperature : temperatures) {
            if (temperature > averageTemp) {
                aboveAverage++;
            }
        }

        // Give results
        System.out.println("Average temperature: " + averageTemp);
        System.out.println("Number of temperatures above average: " + aboveAverage);

        scanner.close();
    }
}
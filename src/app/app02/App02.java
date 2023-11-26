package app.app02;

import java.util.Scanner;

public class App02 {
    static final String CURRENCY = "USD";

    public static void main(String[] args) {
        handleData();
    }

    static void handleData() {
        double[] prices = {5.99, 2.95, 2.99, 3.99, 6.95};
        int lastIndex = prices.length - 1;
        System.out.println("Last index: " + lastIndex);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index from 0 to " + lastIndex + " for search price : ");


        int index = 0;
        try {
            index = scanner.nextInt();
            scanner.close();
            System.out.println("Price in index " + index + " is " + CURRENCY + " " + prices[index]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(index + " is incorrect index " + "\nEnter index from 0 to " + lastIndex
                    + " inclusively.");
        }

    }
}


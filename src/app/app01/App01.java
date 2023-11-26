package app.app01;

import java.util.Scanner;

public class App01 {
    static String num;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        num = scanner.nextLine().trim();
        try {

            Integer.parseInt(num);
            System.out.println("Number is " + num);

        } catch (NumberFormatException exception) {
            System.out.println("Not a number!");
        }

    }
}

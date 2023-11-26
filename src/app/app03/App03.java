package app.app03;

import java.util.Scanner;
import java.util.Locale;


public class App03 {
    static final String CURRENCY = "USD";
    static double cardBalance;
    static double purchase;
    static double totalAmount;

    public static void main(String[] args) {
        handleData();
    }

    public static void handleData() {
        System.out.print("Enter the amount of purchase, " + CURRENCY + " :" );
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        purchase = scanner.nextDouble();
        scanner.close();
        cardBalance = 777.43;
       try{
           validateBalance(cardBalance);
       }catch (InsufficientBalance ib){
           System.out.println(ib.getMessage());
       }
    }


    public static void validateBalance(double cardBalance) throws InsufficientBalance{

        if (purchase > cardBalance) {
            throw new InsufficientBalance("Not enough money.");

        } else {
            totalAmount = cardBalance - purchase;
            System.out.println("Amount of purchase, " + CURRENCY + " :" + Rounder.roundValue(purchase));
            System.out.println("Balance on the card, " + CURRENCY + " :" + Rounder.roundValue(totalAmount));

        }

    }

}

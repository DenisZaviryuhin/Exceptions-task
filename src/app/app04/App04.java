package app.app04;

import java.util.Scanner;
import java.util.Locale;


public class App04 {
    static double temperature;
    static double limitLow;
    static double limitHigh;

    public static void main(String[] args) {
        handleData();

    }

    public static void handleData() {
        System.out.println("Validate device work" + "\n--------------");
        System.out.println("Enter actually temperature in " + "\u2103" + " :");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        temperature = scanner.nextDouble();
        scanner.close();
        try {
            validateWork(temperature);

        } catch (ImpossibleDeviceWork idw) {
            System.out.println("ERROR!" + "\n" + idw.getMessage());


        }
    }


    static void validateWork(double temperature) throws ImpossibleDeviceWork {
        limitLow = -10;
        limitHigh = 35;
        if (temperature <= limitLow || temperature >= limitHigh) {
            throw new ImpossibleDeviceWork("Limit exceeded. Device is not working!");

        } else {
            System.out.println("All fine, device is works at the temperature " + temperature
                    + "\u2103");
        }
    }
}

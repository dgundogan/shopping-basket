package co.uk.lambda.shopping;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Please enter a list of basket. For instance:Apple,Apple,Banana");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.format("Total Price : %.2f pound", basket.computePrice(Arrays.asList(input.split(","))));
        }

        sc.close();
    }
}

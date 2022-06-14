package Fundamentals.MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());



        double endPrice = orderPrice(productInput, quantityInput);

        System.out.printf("%.2f", endPrice);


    }

    public static double orderPrice(String product, int quantity) {
double price = 0;
        switch (product) {
            case "coffee" :
price = 1.5;
                break;
            case "water" :
price = 1.0;
                break;
            case "coke" :
price = 1.4;
                break;
            case "snacks" :
price = 2.0;
                break;
        }
price = price * quantity;

        return price;
    }
}

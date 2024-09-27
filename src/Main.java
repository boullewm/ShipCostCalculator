import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double itemPrice = 0.00;
        double shippingRate = 0.02;
        double shippingCost = 0;
        double totalPrice = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("What is the item price? ");
        if(in.hasNextDouble()){
            itemPrice = in.nextDouble();
            in.nextLine();
        }
        if (itemPrice >= 100) {
            System.out.println("The price you entered is $100 or more, so shipping is free! Your total cost is " + itemPrice);
        } else if (itemPrice < 100) {
            System.out.println("The item price you entered is less than $100, so shipping is 2% of the item price.");
            totalPrice = itemPrice * shippingRate + itemPrice;
            shippingCost = itemPrice * shippingRate;
            System.out.println("The cost of shipping is " + shippingCost);
            System.out.println("Your total is " + totalPrice);
        }


    }
    }
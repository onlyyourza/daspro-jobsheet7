import java.util.Scanner;
public class KafeDoWhile14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffee, tea, bread, totalPrice;
        String customerName;
        int coffeePrice = 12000;
        int teaPrice = 7000;
        int breadPrice = 20000;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction cancelled.");
                break;
            }

            System.out.print("Number of coffee: ");
            coffee = sc.nextInt();
            System.out.print("Number of tea: ");
            tea = sc.nextInt();
            System.out.print("Number of bread: ");
            bread = sc.nextInt();

            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total price for " + customerName + " is: " + totalPrice);
            sc.nextLine();
        } while (true);

        System.out.println("All transactions completed.");
        sc.close();
    }
}

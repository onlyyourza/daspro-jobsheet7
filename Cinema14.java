import java.util.Scanner;
public class Cinema14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ticketPrice = 50000;
        int totalTickets = 0;
        double totalSales = 0;
        int ticketsBought;
        double discount, subtotal;

        System.out.println("=== Cinema Ticket ===");
        while (true) {
            System.out.print("Enter number of tickets purchased (0 to exit or done): ");
            ticketsBought = sc.nextInt();

            if (ticketsBought == 0) {
                break;
            }

            if (ticketsBought < 0) {
                System.out.println("Invalid input! Please enter a valid number of tickets.");
                continue;
            }

            subtotal = ticketsBought * ticketPrice;
            discount = 0;
            if (ticketsBought > 10) {
                discount = 0.15 * subtotal; 
            } else if (ticketsBought > 4) {
                discount = 0.10 * subtotal;
            }

            subtotal -= discount;
            totalTickets += ticketsBought;
            totalSales += subtotal;

            System.out.println("Subtotal after discount: Rp " + subtotal);
        }
        System.out.println("\n=== End of Day Summary ===");
        System.out.println("Total tickets sold: " + totalTickets);
        System.out.println("Total sales: Rp " + totalSales);

        sc.close();
    }
}

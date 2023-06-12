import java.text.DecimalFormat;
import java.util.Scanner;

public class BillInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Product 1 details
        System.out.println("Enter product 1 details:");
        String prod1Id = scanner.nextLine();
        String prod1Name = scanner.nextLine();
        int prod1Quantity = scanner.nextInt();
        double prod1UnitPrice = scanner.nextDouble();

        // Product 2 details
        System.out.println("Enter product 2 details:");
        scanner.nextLine(); // Consume the remaining newline character
        String prod2Id = scanner.nextLine();
        String prod2Name = scanner.nextLine();
        int prod2Quantity = scanner.nextInt();
        double prod2UnitPrice = scanner.nextDouble();

        // Product 3 details
        System.out.println("Enter product 3 details:");
        scanner.nextLine(); // Consume the remaining newline character
        String prod3Id = scanner.nextLine();
        String prod3Name = scanner.nextLine();
        int prod3Quantity = scanner.nextInt();
        double prod3UnitPrice = scanner.nextDouble();

        // Calculate totals
        double prod1Total = prod1Quantity * prod1UnitPrice;
        double prod2Total = prod2Quantity * prod2UnitPrice;
        double prod3Total = prod3Quantity * prod3UnitPrice;
        double netAmount = prod1Total + prod2Total + prod3Total;

        // Print bill interface
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("\n-----------BILL-----------");
        System.out.println("Product ID\tProduct Name\tQuantity\tUnit Price\tTotal");
        System.out.println(prod1Id + "\t\t" + prod1Name + "\t\t" + prod1Quantity + "\t\t" + prod1UnitPrice + "\t\t" + decimalFormat.format(prod1Total));
        System.out.println(prod2Id + "\t\t" + prod2Name + "\t\t" + prod2Quantity + "\t\t" + prod2UnitPrice + "\t\t" + decimalFormat.format(prod2Total));
        System.out.println(prod3Id + "\t\t" + prod3Name + "\t\t" + prod3Quantity + "\t\t" + prod3UnitPrice + "\t\t" + decimalFormat.format(prod3Total));
        System.out.println("\nNet Amount: " + decimalFormat.format(netAmount));

        scanner.close();
    }
}


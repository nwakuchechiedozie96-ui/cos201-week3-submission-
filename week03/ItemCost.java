import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the item: ");
        String itemName = scanner.nextLine();
        
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Enter the price per unit: ");
        double pricePerUnit = scanner.nextDouble();
        
        double totalCost = quantity * pricePerUnit;
        
        System.out.println("\n--- Item Cost Summary ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Unit: $" + pricePerUnit);
        System.out.println("Total Cost: $" + totalCost);
        
        scanner.close();
    }
}

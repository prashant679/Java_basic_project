import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Enter name of the item: ");
        item = scanner.nextLine();

        System.out.print("Enter the price: ");
        price = scanner.nextDouble();

        System.out.print("Enter the total quantity: " );
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total is "+ currency + total);
        scanner.close();
    }
}

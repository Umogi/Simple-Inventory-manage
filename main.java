import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        invetory track = new invetory();

        int nextID = 0;
        boolean run = true;
        while (run == true) {
            System.out.println("===== Inventory System =====");
            System.out.println("1. Add an Item");
            System.out.println("2. View Inventory");
            System.out.println("3. Update an Item");
            System.out.println("4. Update a Price");
            System.out.println("5. Delete an Item");
            System.out.println("6. Search for an Item");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            System.out.println("");
            
            switch (choice) {
                case 1:
                    nextID++;
                    System.out.println("===== Add Item =====");

                    System.out.print("Name");
                    String name = scanner.nextLine();

                    System.out.print("Quantity");
                    int quantity = scanner.nextInt();

                    System.out.print("Price");
                    double price = scanner.nextDouble();

                    track.addItem(nextID, name, quantity, price);
                    break;
                case 2:
                    track.viewItems();
                    break;
                case 3:
                    track.upDateItem();                
                    break;
                case 4:
                    track.upDatePrice();
                    break;
                case 5:
                    track.deleteItem();
                    break;
                case 6:
                    track.searchItem();
                    break;
                case 7:
                    run = false;
                    break;
            
                default:
                    break;
            }
        }   
    }
}

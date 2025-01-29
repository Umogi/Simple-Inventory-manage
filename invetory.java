import java.util.ArrayList;
import java.util.Scanner;

public class invetory {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<items> invetories;

    public invetory(){
        invetories = new ArrayList<>();
    }

    public void addItem(int ID, String name, int quantity, double price){
        invetories.add(new items(ID, name, quantity, price));       
    }

    public void viewItems(){
        System.err.println("===== View Item =====");
        for (items item : invetories){
            System.out.println(item);
        }
    }

    public void upDateItem(){
        System.err.println("===== UpDate Item =====");
        for (items item : invetories){
            System.out.println(item);
        }
        System.out.print("Piick item ID: ");
        int choice = scanner.nextInt();

        for (items item : invetories){
            if (item.getID() == choice){
                System.out.println("Item Amount: " + item.getQuantity());
                System.out.print("New Amount: ");
                int newAmount = scanner.nextInt();
                item.setQuantity(newAmount);
                break;
            }
        }
    }

    public void upDatePrice(){
        System.err.println("===== UpDate price =====");
        for (items item : invetories){
            System.out.println(item);
        }
        System.out.print("Piick item ID: ");
        int choice = scanner.nextInt();

        for (items item : invetories){
            if (item.getID() == choice){
                System.out.println("Item Price: " + item.getPrice());
                System.out.print("New Price: ");
                int newAmount = scanner.nextInt();
                item.setPrice(newAmount); 
                break;
            }
        }
    }

    public void deleteItem(){
        System.err.println("===== Delete Item =====");
        for (items item : invetories){
            System.out.println(item);
        }
        System.out.println("Pick item ID: ");
        int choice = scanner.nextInt();
        for (items item : invetories){
            if(item.getID() == choice){
                item.setQuantity(0);
                System.out.println("This item didn't got delete. Quanity set to 0!");
                break;
            }
        }
    }

    public void searchItem(){
        System.out.println("===== Search Item =====");
        String searchItem = scanner.nextLine();

        for (items item : invetories){
            if (item.getName().equals(searchItem)){
                System.out.println(item);
            }
        }
    }
}

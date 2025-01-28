import java.util.ArrayList;

public class invetory {
    private ArrayList<items> invetories;

    public invetory(){
        invetories = new ArrayList<>();
    }

    public void addItem(int ID, String name, int quantity, double price){
        invetories.add(new items(ID, name, quantity, price));       
    }

    public void viewItems(){
        for (items item : invetories){
            System.out.println(item);
        }
    }

    
}

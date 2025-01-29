public class items {
    int ID;
    String name;
    int quantity;
    double price;

    public items(int ID, String name, int quantity, double price){
        this.ID = ID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "ID: " + this.ID + " - " + this.name + " - " + this.quantity + " - " + this.price;
    }
}

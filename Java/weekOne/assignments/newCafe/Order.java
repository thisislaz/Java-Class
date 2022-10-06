import java.util.ArrayList;
public class Order{
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items =  new ArrayList<Item>();


    public void orderSummary(){
        System.out.println("Name: " + this.name);
        System.out.println("Total: " + this.total);
        System.out.println("Ready: " + this.ready);
        System.out.println("Items: ");
        for(Item eachItem: this.items){
            eachItem.itemInfo();
        }
        
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public double getTotal(){
        return this.total;
    }    

    public void setTotal(double total){
        this.total += total;
    }

    public void isReady(boolean ready){
        this.ready = true;
    }
}
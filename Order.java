package question2.menu;

import java.util.ArrayList;

/*a class that represents an order*/
public class Order{

    protected ArrayList<Item> items;

    public Order(){
        items = new ArrayList<Item>();
    }

    /*a method to add an item to this order*/
    public void addToOrder(Item i){
        items.add(i);
    }
    //getters
    public ArrayList<Item> getItems(){
        return items;
    }
    /*a method that returns a string representation of the order*/
    public String toString(){
        int sum = 0;
        String res = "";
        res = res.concat("quantity\tname\t\tprice\n");
        for(Item i : items){
            res = res.concat(i.toString() + "$\n");
            sum += (i.price) * (Integer.valueOf(i.quantity.getValue()));
        }
        res = res.concat("Total:\t" + sum + "$");
        return res;
    }
}

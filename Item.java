package question2.menu;

import javafx.collections.FXCollections;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;

/*a class to represents an item in the menu*/

public class Item {

    protected CheckBox name;
    protected int price;
    protected ComboBox<String> quantity;

    public Item(String name, int price){
        String[] options = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        this.name = new CheckBox(name);
        this.price = price;
        this.quantity = new ComboBox<String>(FXCollections.observableArrayList(options));
        this.quantity.setValue("0");
    }
/*setters and getters*/
    public void setName(String name){
        this.name.setText(name);
    }

    public void setPrice(int price){
        this.price = price;
    }

    public CheckBox getName() {
        return name;
    }

    public int getPrice() {
       return price;
    }

    public ComboBox getQuantity(){
        return quantity;
    }

    /*a method that returns a String representation of the item*/
    public String toString(){
        String res = "";
        res = res.concat(quantity.getValue() + "\t\t\t" + name.getText() + "\t\t" +  String.valueOf(price));
        return res;
    }
}

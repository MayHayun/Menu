package question2.menu;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Menu {
    protected ArrayList<Item> appetizers;
    protected ArrayList<Item> mainCourses;
    protected ArrayList<Item> desserts;
    protected ArrayList<Item> drinks;

    public Menu(){
        appetizers = new ArrayList<Item>();
        mainCourses = new ArrayList<Item>();
        desserts = new ArrayList<Item>();
        drinks = new ArrayList<Item>();
    }

    public void addApp(Item i){
        appetizers.add(i);
    }
    public void addMain(Item i){
        mainCourses.add(i);
    }

    public void addDes(Item i){
        desserts.add(i);
    }

    public void addDrink(Item i){
        drinks.add(i);
    }

    public ArrayList<Item> getAppetizers(){
        return appetizers;
    }
    public ArrayList<Item> getMainCourses(){
        return mainCourses;
    }

    public ArrayList<Item> getDesserts(){
        return desserts;
    }

    public ArrayList<Item> getDrinks(){
        return drinks;
    }
}

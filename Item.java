
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    String itemName;
    String description;
    String itemType;
    
    public Item(String nameOfItem, String typeOfItem, String itemDescription){
        itemName = nameOfItem;
        itemType = typeOfItem;
        description = itemDescription;
    }
    
    public Item(){
        itemName = "Bob";
        itemType = "Material";
        description = "Random piece of junk found on the floor. Does nothing.";
        
    }
    
    public String getName(){
        return itemName;
    }
    
    public String getDescription(){
        return description;
    }
    
    
}


/**
 * Write a description of class MagicalItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class MagicalItem extends Item
{
    int value;
    int age;
    
    public MagicalItem(String itemName, String itemType, String description, int value, int age){
        super(itemName, itemType, description);
        this.value = value;
        this.age = age;
    }
    
    public MagicalItem(){
        super();
        value = 1000;
        age = 121;
    }
    
    
    
    
}

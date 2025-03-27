
/**
 * Write a description of class CursedItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CursedItem extends MagicalItem
{
    String curse;
    String lore;
    
    public CursedItem(String itemName, String itemType, String description, int value, int age, String curse, String lore){
        super(itemName, itemType, description, value, age);
        this.curse = curse;
        this.lore = lore;
    }
    
    public CursedItem(){
        super();
        curse = "Curses owner to forever want milk but never find it.";
        lore = "A bitter old man that hates people who love milk wanted to make them suffer, and thus this curse was created and placed onto this item. Truly a vile person.";
    }
    
    public String returnItemCurse(){
        return curse;
    }
    
    public String returnLore(){
        return lore;
    }
    
}

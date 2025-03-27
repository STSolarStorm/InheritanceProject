
/**
 * Write a description of class OreAndMineral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OreAndMineral extends Item
{
    String ore;
    int value;
    int numHeld;
    
    public OreAndMineral(String itemName, String itemType, String description, String ore, int value, int onPerson){
        super(itemName, itemType, description);
        this.ore = ore;
        this.value = value;
        numHeld = onPerson;
    }
    
    public OreAndMineral(){
        super();
        ore = "Iron";
        value = 4;
        numHeld = 12;
    }
    
    public String getOre(){
        return ore;
    }
    
    public int getValue(){
        return value;
    }
    
    public int getNumberOfOreHeld(){
        return numHeld;
    }
    
}


/**
 * Write a description of class MagicCrystal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicCrystal extends MagicalItem
{
    String color;
    boolean doesItGlow;
    String magicalProperty;
    String averageUsage;
    
    public MagicCrystal(String itemName, String itemType, String description, int value, int age, String color,
    boolean glow, String magicalProperty, String usage){
        super(itemName, itemType, description, value, age);
        this.color = color;
        doesItGlow = glow;
        this.magicalProperty = magicalProperty;
        averageUsage = usage;
    }

    public MagicCrystal(){
        super();
        color = "Blue";
        doesItGlow = true;
        magicalProperty = "Prolonged contact with this crystal rapidly reduces one's core temperature to below 0°C.";
        averageUsage = "Usually used to cool rooms and objects down, often utilized in conjunction with another item that balances the effects of this item.";
    }
    
    public String returnColor(){
        return color;
    }
    
    public boolean returnIfGlow(){
        return doesItGlow;
    }
    
    public String returnMagicalProperty(){
        return magicalProperty;
    }
    
    public String returnAverageUse(){
        return averageUsage;
    }
    
}

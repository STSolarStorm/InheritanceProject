
/**
 * Write a description of class Potions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Potion extends Consumable implements ConsumableInterface
{
    String potionType;
    String potionEffect;
    int numOfPotions;
    
    public Potion(String itemName, String itemType, String description, String typeOfPotion, String effectOfPotion, int potionNum){
        super(itemName, itemType, description);
        potionType = typeOfPotion;
        potionEffect = effectOfPotion;
        numOfPotions = potionNum;
        
    }
    
    public Potion(){
        super();
        potionType = "Strength";
        potionEffect = "Enhances one's strength by 2 points.";
        numOfPotions = 2;
    }
    
    public String consume(){
        numOfPotions--;
        return "You have consumed one " + potionType + " potion.";
    }
}

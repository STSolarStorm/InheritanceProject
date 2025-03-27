
/**
 * Write a description of class ProtectionGear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProtectionGear extends Item implements DefenseCommands
{
    String typeOfProtection;
    String protGearRank;
    int durability;
    public ProtectionGear(String itemName, String itemType, String description, String protectionType, String rankOfProtGear, int durability){
        super(itemName, itemType, description);
        typeOfProtection = protectionType;
        protGearRank = rankOfProtGear;
        this.durability = durability;
    }
    
    public ProtectionGear(){
        super();
        typeOfProtection = "Shield";
        protGearRank = "Common";
        durability = 20;
    }

    public String getTypeOfProtection(){
        return typeOfProtection;
    }
    
    public boolean blocked(){
        int randomNum = (int)(Math.random() * 10 + 1);
        if(randomNum >= 2){
            return true;
        }
        return false;
    }
}

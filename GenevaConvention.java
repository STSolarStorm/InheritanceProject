
/**
 * Write a description of class GenevaConvention here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GenevaConvention extends Item
{
    String protocolBroken;
    String warCrime;
    String itemAction;
    int damage;
    int range;
    boolean statusEffect;
    
    
    public GenevaConvention(String itemName, String itemType, String description, String whichProtocolBroken, String warCrime,
    String action, int damage, int range, boolean statusEffect){
        super(itemName, itemType, description);
        protocolBroken = whichProtocolBroken;
        this.warCrime = warCrime;
        itemAction = action;
        this.damage = damage;
        this.range = range;
        this.statusEffect = statusEffect;
        
    }
    
    public GenevaConvention(){
        super();
        protocolBroken = "Protocal III: Incendiary Weapons";
        warCrime = "Death by fire";
        itemAction = "Spews a lengthy stream of flame over long distances. Nearly impossible to extinguish or get off before death.";
        damage = 300;
        range = 50;
        statusEffect = true;
    }
    
    public String ReturnWhichProtocolIsBroken(){
        return protocolBroken;
    }
    
    public String returnWarCrime(){
        return warCrime;
    }
    
    public String returnAction(){
        return itemAction;
    }
    
    public int returnDamage(){
        return damage;
    }
    
    public int returnRange(){
        return range;
    }
    
    public boolean returnHasStatusEffect(){
        return statusEffect;
    }
}


/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    String weaponType;
    int durability;
    String weaponRank;
    public Weapon(String itemName, String itemType, String description, int durability, String typeOfWeapon, String rankOfWeapon){
        super(itemName, itemType, description);
        this.durability = durability;
        weaponType = typeOfWeapon;
        weaponRank = rankOfWeapon;
    }
    
    public Weapon(){
        super();
        durability = 10;
        weaponType = "Melee";
        weaponRank = "Common";
    }
    
    
}




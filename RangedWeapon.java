
/**
 * Write a description of class RangedWeapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RangedWeapon extends Weapon
{
    String typeOfRangedWeapon;
    int damage;
    int usableRange;
    boolean enchantment;

    public RangedWeapon(String itemName, String itemType, String description, int durability, String weaponType, String weaponRank, String rangedWeaponType,
    int damage, int rangeOfUse, boolean enchantment){
        super(itemName, itemType, description, durability, weaponType, weaponRank);
        typeOfRangedWeapon = rangedWeaponType;
        this.damage = damage;
        usableRange = rangeOfUse;
        this.enchantment = enchantment;
    }

    public RangedWeapon(){
        super();
        typeOfRangedWeapon = "Longbow";
        damage = 10;
        usableRange = 100;
        enchantment = false;
    }

    public String getTypeOfRangedWeapon(){
        return typeOfRangedWeapon;
    }

    public int attack(){
        int randomNum = (int)(Math.random() * 10 + 1);
        if(randomNum >= 2){
            return damage;
        }
        return 0;
    }

    public boolean parry(){
        int randomNum = (int)(Math.random() * 10 + 1);
        if(randomNum >= 8){
            return true;
        }
        return false;
    }
    
    public boolean hasEnchantment(){
        return enchantment;
    }
}

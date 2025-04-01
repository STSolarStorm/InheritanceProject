
/**
 * Write a description of class MeleeWeapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MeleeWeapon extends Weapon
{
    String typeOfMeleeWeapon;
    int damage;
    int attackReach;
    boolean enchantment;

    public MeleeWeapon(String itemName, String itemType, String description, int durability, String weaponType, String weaponRank, String meleeWeaponType,
    int damage, int reachOfAttack, boolean enchantment){
        super(itemName, itemType, description, durability, weaponType, weaponRank);
        typeOfMeleeWeapon = meleeWeaponType;
        this.damage = damage;
        attackReach = reachOfAttack;
        this.enchantment = enchantment;

    }

    public MeleeWeapon(){
        super();
        typeOfMeleeWeapon = "Longsword";
        damage = 10;
        attackReach = 5;
        enchantment = false;
    }

    public String getTypeOfMeleeWeapon(){
        return typeOfMeleeWeapon;
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
        if(randomNum >= 3){
            return true;
        }
        return false;
    }
    
    public boolean hasEnchantment(){
        return enchantment;
    }
}

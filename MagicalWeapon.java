
/**
 * Write a description of class MagicalWeapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicalWeapon extends Weapon
{
    String typeOfMagicalWeapon;
    String magicalWeaponDoes;
    String statusEffect;
    int magicalWeaponDamage;
    int magicalWeaponRange;
    int AOEinMeters;
    
    public MagicalWeapon(String itemName, String itemType, String description, int durability, String weaponType, String weaponRank,
    String magicalWeaponType, String doesWhat, String statusEffect, int damage, int range, int AOE){
        super(itemName, itemType, description, durability, weaponType, weaponRank);
        typeOfMagicalWeapon = magicalWeaponType;
        magicalWeaponDoes = doesWhat;
        this.statusEffect = statusEffect;
        magicalWeaponDamage = damage;
        magicalWeaponRange = range;
        this.AOEinMeters = AOEinMeters;
    }
    
    public MagicalWeapon(){
        super();
        typeOfMagicalWeapon = "Staff";
        magicalWeaponDoes = "Casts a spell.";
        statusEffect = "AOE itch effect. Not effective, but super annoying.";
        magicalWeaponDamage = 1;
        magicalWeaponRange = 50;
        AOEinMeters = 2;
    }
    
    public int attack(){
        int randomNum = (int)(Math.random() * 10 + 1);
        if(randomNum >= 5){
            return 0;
        }
        
        return magicalWeaponDamage;
    }
    
    public boolean parry(){
        int randomNum = (int)(Math.random() * 10 + 1);
        if(randomNum >= 4){
            return true;
        }
        return false;
    }
    
    public String statusEffect(){
        return statusEffect;
    }
    
    public String typeOfMagicalWeapon(){
        return typeOfMagicalWeapon;
    }
    
    public int returnAttackRange(){
        return magicalWeaponRange;
    }
    
    public int returnAreaOfEffectInMeters(){
        return AOEinMeters;
    }
    
}

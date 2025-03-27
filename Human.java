
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Character
{
    String subRace;
    boolean hasMagic;
    boolean isHybrid;
    String ability;
    
    public Human(String firstName, String lastName, String sex, String birthday, int age, int heightInCentimeters,
    String characterClass, String race, String subRace, boolean hasMagic, boolean isHybrid, String ability){
        super(firstName, lastName, sex, birthday, age, heightInCentimeters, characterClass, race);
        this.subRace = subRace;
        this.hasMagic = hasMagic;
        this.isHybrid = isHybrid;
        this.ability = ability;
    }
    
    public Human(){
        super();
        subRace = "White";
        isHybrid = false;
        ability = "Can scream and attract the attention of other humans.";
    }
    
    public String humanRace(){
        return subRace;
    }
    
    public boolean doesHaveMagic(){
        return hasMagic;
    }
    
    public boolean isAHybrid(){
        return isHybrid;
    }
    
    public String returnAbility(){
        return ability;
    }
    
}

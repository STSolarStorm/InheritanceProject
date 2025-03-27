
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Character
{
    String subRace;
    String ability;
    
    public Elf(String firstName, String lastName, String sex, String birthday, int age, int heightInCentimeters,
    String characterClass, String race, String subRace, String ability){
        super(firstName, lastName, sex, birthday, age, heightInCentimeters, characterClass, race);
    }
    
    public Elf(){
        super();
        subRace = "Dark Elf";
        ability = "Conjure up strong winds.";
    }
    
    public String returnSubRace(){
        return subRace;
    }
    
    public String returnAbility(){
        return ability;
    }
}

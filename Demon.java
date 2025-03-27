
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Character
{
    String subRace;
    String ability;
    
    public Demon(String firstName, String lastName, String sex, String birthday, int age, int heightInCentimeters,
    String characterClass, String race, String subRace, String ability){
        super(firstName, lastName, sex, birthday, age, heightInCentimeters, characterClass, race);
        this.ability = ability;
    }
    public Demon(){
        super();
        subRace = "Devil";
        ability = "Create flames that burns one's enemies to ashes.";
        
    }
    
    public String returnSubRace(){
        return subRace;
    }
    
    public String returnAbility(){
        return ability;
    }
}

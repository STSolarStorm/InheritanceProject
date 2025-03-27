
/**
 * Write a description of class Relics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Relic extends Item 
{
    int ageInYears;
    int value;
    public Relic(String itemName, String itemType, String description, int age, int value){
        super(itemName, itemType, description);
        ageInYears = age;
        this.value = value;
    }
    
    public Relic(){
        super();
        ageInYears = 100;
        value = 1000;
        
    }
    
    public int returnAge(){
        return ageInYears;
    }
    
    public int returnValue(){
        return value;
    }
    
}



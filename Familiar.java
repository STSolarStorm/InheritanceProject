
/**
 * Write a description of class Familiar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Familiar extends Item implements FamiliarInterface
{
    String doesWhat;
    int age;
    int damageDealing;
    String [] relationships = {"Hostile", "Neutral", "Friendly", "Best Friends", "Friends with Benefits?", "Definitely Lovers"};
    String relationShip;
    
    public Familiar(String itemName, String itemType, String description, String action,
    String[] ownerRelation, int age, int damage){
        super(itemName, itemType, description);
        doesWhat = action;
        relationships = ownerRelation;
        this.age = age;
        damageDealing = damage;
    }
    
    public Familiar(){
        super();
        doesWhat = "Spits at enemies. No special effect, just spit.";
        relationShip = relationships[2];
        age = 4;
        damageDealing = 1;
    }
    
    public void relationship(int relationshipPoints){
        if(relationshipPoints >= 95){
            relationShip = relationships[5];
        } else if(relationshipPoints >= 90){
            relationShip = relationships[4];
        } else if(relationshipPoints >= 80){
            relationShip = relationships[3];
        } else if(relationshipPoints >= 70){
            relationShip = relationships[2];
        } else if(relationshipPoints >= 50){
            relationShip = relationships[1];
        } else if(relationshipPoints < 50 ){
            relationShip = relationships[0];
        }
        
    }
    
    public int attack(){
        return damageDealing;
    }
    
    public String pet(){
        return "You pet your familiar " + itemName + " .";
    }
    
    public String returnRelationship(){
        return relationShip;
    }
    
    
}



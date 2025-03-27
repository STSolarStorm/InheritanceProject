
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food extends Consumable implements ConsumableInterface
{
    String foodType;
    int numOfFood;
    int fillHowMuch;
    
    public Food(String itemName, String itemType, String description, String typeOfFood, int foodNum, int howMuchFilled){
        super(itemName, itemType, description);
        foodType = typeOfFood;
        numOfFood = foodNum;
        fillHowMuch = howMuchFilled;
        
    }
    
    public Food(){
        super();
        foodType = "Dog Meat";
        numOfFood = 18;
        fillHowMuch = 2;
    }
    
    public String consume(){
        numOfFood--;
        return "You have consumed one " + foodType + " .";
    }
    
}

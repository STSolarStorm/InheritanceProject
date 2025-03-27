
/**
 * Write a description of class Currency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Currency extends Item
{
    String typeOfCurrency;
    double value;
    
    public Currency(String itemName, String itemType, String description, String currencyType, double value){
        super(itemName, itemType, description);
        typeOfCurrency = currencyType;
        this.value = value;
    }
    
    public Currency(){
        super();
        typeOfCurrency = "Coin";
        value = 1;
    }
    

    public String typeOfCurrency(){
        return typeOfCurrency;
    }
    
    public double value(){
        return value;
    }
}

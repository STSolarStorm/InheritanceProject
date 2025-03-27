
/**
 * Write a description of class SpellBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class SpellBook extends MagicalItem
{
    ArrayList<String> magicSpells;
    
    public SpellBook(String itemName, String itemType, String description, int value, int age, String magicSpell){
        super(itemName, itemType, description, value, age);
        magicSpells = new ArrayList<String>();
        magicSpells.add(magicSpell);
    }

    public SpellBook(){
        super();
        magicSpells = new ArrayList<String>();
        magicSpells.add("Cast Fireball");
        magicSpells.add("Cast Splash Water");
        magicSpells.add("Cast Bolt of Electricity");
        magicSpells.add("Cast Earth Toss");
        magicSpells.add("Cast Gust of Wind");

    }

    public void addSpell(String newSpell){
        magicSpells.add(0, newSpell);

    }

    public void removeSpell(int index){
        magicSpells.remove(index);
    }

    public void displaySpells(){
        for(String spells : magicSpells){
            System.out.println(spells);
        }
    }
}



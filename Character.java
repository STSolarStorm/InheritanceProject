
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Character
{
   String firstName;
   String lastName;
   String title;
   String sex;
   String birthday;
   int age;
   int heightInCentimeters;
   String characterClass;
   String race;
   
   public Character(String firstName, String lastName, String title, String sex, String birthday, int age,
   int heightInCentimeters, String characterClass, String race){
       this.firstName = firstName;
       this.lastName = lastName;
       this.title = title;
       this.sex = sex;
       this.birthday = birthday;
       this.age = age;
       this.heightInCentimeters = heightInCentimeters;
       this.characterClass = characterClass;
       this.race = race;
   }
   
   public Character(){
       firstName = "Adam";
       lastName = "Smith";
       sex = "Male";
       birthday = "January 1st";
       age = 32;
       heightInCentimeters = 192;
       characterClass = "Adventurer";
       race = "Human";
   }
   
}

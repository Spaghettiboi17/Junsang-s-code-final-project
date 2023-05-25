import java.util.ArrayList;
public class Character {
    
    private String type;
 
    private int luck;
    private int Strength;
    private int Arcana;
    private int endurance;
    private ArrayList <String> inventory = new ArrayList <String>();
    
    public Character(String acytype, int lucky, int Strong, int magic, int health){
        type = acytype; 

        luck = lucky;
        Strength = Strong; 
        endurance = health;
        Arcana = magic;
    }
    
    
    public Character(){
        
        
    }
    
    public void damaged(int attack)
    {
        
        endurance = endurance - attack;  
        
    }
    
    public void heal(){
        
        
        endurance = endurance + 10;
        
    }
    
    
    public void inventoryAddition( String object){
        
        inventory.add(object); 
        
    }
    
    
}

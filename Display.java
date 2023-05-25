import java.util.ArrayList;
import java.util.Scanner;


public class Display
{
    
    public static void main(String[] args)
    {
        
        // Ascii art for the main game!
        // example of a visable interface within the code
        //
        int[][] displayScreen;
        int displayScreenSize; 
        System.out.println("  _______  ______   __   __  _______  __    _  _______  __   __  ______    _______  ");
        System.out.println(" |   _   ||      | |  | |  ||       ||  |  | ||       ||  | |  ||    _ |  |       |  ");
        System.out.println(" |  |_|  ||  _    ||  |_|  ||    ___||   |_| ||_     _||  | |  ||   | ||  |    ___|  ");
        System.out.println(" |       || | |   ||       ||   |___ |       |  |   |  |  |_|  ||   |_||_ |   |___    ");
        System.out.println(" |       || |_|   ||       ||    ___||  _    |  |   |  |       ||    __  ||    ___| " );
        System.out.println(" |   _   ||       | |     | |   |___ | | |   |  |   |  |       ||   |  | ||   |___   " );
        System.out.println(" |__| |__||______|   |___|  |_______||_|  |__|  |___|  |_______||___|  |_||_______| " );
        System.out.println();
        System.out.println("                                The game!");



       System.out.println("Loading");
        for (int i = 1; i < 7; i+=1){
            System.out.print("*");
            System.out.println(" ");
        }
        
// This inital line of code acts to determine the overall size of the playabe area 
// It is able to take in user inputs and then apply them to determine the size of the map
//

        System.out.println("What kind of adventure do you wish to embark?");
        System.out.println(" ");
        System.out.println("1. A short trip\n2. A nice hike\n3. A long expodition\n");

       
        Scanner myObj = new Scanner(System.in);
        boolean metcondition = true;
        int size=0;
       int input = myObj.nextInt();
       
       
    // Here is an methode from the "input manager" class which serves 
    // to streamline the handeing of inputs for situations!
    //   
        Inputchecker inputmanager = new Inputchecker(input,0,4);
        
    while(metcondition){
        
    // Here is the map size unit which determines the size of the playable area
    // an example of the use of a 2d Array
    //
        
        
     metcondition =  !inputmanager.inputcheck(input);
       } 
      
        if (size == 3){
            
          displayScreen = new int[10][10]; 
          
            
        }
        else if( size == 2 ){
            
          displayScreen = new int[8][8];  
            
        }
         else if( size == 1 ){
            
          displayScreen = new int[4][4];  
            
        }
        
        
        
        // This series of code basically is the "character picker" of the game
        // The code below show the implementation of the new "character" class with a constructor show below!
        // 
    
        
        System.out.println("Welcome brave adventerer what profession do you have? \n 1. A rookie adventurer on their first quest! \n 2. A seasoned veteran with abilities in the arcaine and in the sword! \n 3. A rookie mage taking their first steps outside of the academy! \n 4. A learned wizard with a wide varity of skills and a few screws loose! \n 5. A nobody who simply came here to collect some mushrooms(Warning hard start)! \n 6. Let fate decide!\n");
          
        Scanner myObj2 = new Scanner(System.in);
        boolean metcondition2 = true;
        int size2=0;
        int input2 = myObj2.nextInt();
        Inputchecker inputmanager2 = new Inputchecker(input2,0,7);
        
        while(metcondition2){
         metcondition2 =  !inputmanager2.inputcheck(input2);
       } 
       
      
       //Addtionally if a character type is picked their inventory will get a series of objects 
       //being an example of an Array list as the inventory function is actually an Array list
       //
       if(input2 == 6){
         input2 = (int)(Math.random()*5+1); 
       }
       
       else if (input2 == 1){
           
           Character adventureman = new Character(" novice adventurer",2,4,2,4 );
           adventureman.inventoryAddition("map");
           adventureman.inventoryAddition("health potion");
           adventureman.inventoryAddition("health potion");
           adventureman.inventoryAddition("health potion");
        adventureman.inventoryAddition("torch");
           adventureman.inventoryAddition("Short sword");
           adventureman.inventoryAddition("Short bow");
           
       }
       else if(input2 == 2){
           
           Character adventureman2 = new Character(" Senior adventurer", 4,8,4,8);
            
       adventureman2.inventoryAddition("map");
       adventureman2.inventoryAddition("health potion");
           adventureman2.inventoryAddition("health potion");
           adventureman2.inventoryAddition("health potion");
           adventureman2.inventoryAddition("torch");
           adventureman2.inventoryAddition("Long sword");           
           adventureman2.inventoryAddition("cross bow");
           
       }
       
       else if(input2 == 3){
           
           Character adventureman3 = new Character(" rookie mage", 4,2,4,2);
            
           adventureman3.inventoryAddition("map");
           adventureman3.inventoryAddition("torch");
           adventureman3.inventoryAddition("stave");
           adventureman3.inventoryAddition("book of magic");
          
       }
       
          else if(input2 == 4){
           
           Character adventureman4 = new Character(" wizard", 4,2,4,2);
            
          adventureman4.inventoryAddition("map");
           adventureman4.inventoryAddition("torch");
          adventureman4.inventoryAddition("War staff");
           adventureman4.inventoryAddition("grimore");
           
       }
       
       else if(input2 == 4){
           
           Character adventureman5 = new Character(" wizard", 4,2,4,2);
            
         adventureman5.inventoryAddition("map");
           adventureman5.inventoryAddition("torch");
           adventureman5.inventoryAddition("War staff");
           adventureman5.inventoryAddition("grimore");
           
       }
       
        else if(input2 == 5){
           
           Character adventureman6 = new Character(" Mushroom collector", 1,2,1,2);
            
          adventureman6.inventoryAddition("map");
          adventureman6.inventoryAddition("torch");
           adventureman6.inventoryAddition("Bag of shrooms");
           
       }
       
       
       
       
       // This final bit a code simulates an encounter with an friendly NPC 
       //  the "Good NPC" class is used with inherits a constructor from the NPC class
       //
       //
       
       System.out.println(" Welcome to your adventure!, As you are going on your way you meet an person!");
       
       GoodNPC newPerson = new GoodNPC(5);
       
        System.out.println("The person's name is " + newPerson.namer() + " and they say " +newPerson.talk() );
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
    }
}

// Name     =  Akhil Palli 
// Period   =   7
// Description: This program is meant to pick out the perfect pet for you based on 
//              your inputs such as your name your favorite season and your favorite
//              color.                 



import java.util.*;
public class PetSelector{

    public static void main (String[] args){
        Scanner obj = new Scanner(System.in); 

        //ask the user for input (name, season and color)
        System.out.println("Enter your name");
        String name = obj.nextLine();
               name = name.toLowerCase();
        System.out.println("Enter your favorite season");
        String season = obj.nextLine();
               season = season.toLowerCase();
        System.out.println("Enter your favorite color ");
        String color = obj.nextLine();
               color = color.toLowerCase(); 

        String Pet = " ";

        Boolean vowel = null ; 
        Boolean consonant = null; 



        // vowel Checker 
         if (name.length()>0){
            char firstletter = name.charAt(0);
            if (firstletter == 'a' || firstletter == 'e' || firstletter == 'i' || firstletter == 'o' || firstletter == 'u'){
              vowel = true; 
            }
            else{
              consonant = true;
            }
         }
        else {
            System.out.println("please eter a string ");
        }
        






// main programs conditional 


        if (color == "blue" || color == "red" || color == "blue"){

             if (color ==  "blue" && season == "fall" ){
                Pet = "Alligator";
             }
             else if (color == "blue" && season == "spring"){
                Pet = "Ostritch";
             }
             else if (color == "green" && season != "fall"){
                if (Pet == "Giraffee"){Pet ="Giraffee"; } else{Pet = "Dog";}
            }
            else if(color == " red "){
                if (vowel == true){Pet = "Porcupine";} else {Pet = "Panda";}
            }
            else if (season == "summer"){
                 if (!(Pet.equals("Dog") || Pet.equals("Panda") || Pet.equals("Porcupine"))) {
                        Pet = "Pony";
                 }
            }
            else if (consonant == true && color.equals("blue") && !season.equals("summer") && !season.equals("fall")) {
                if (!Pet.equals("Ostrich")) {
                        Pet = "Axolotl";
                }
             }

        }
        else{
           System.out.println( "Please enter propper inputs");
        } 

        // final check it just adds the rock to it 

        if (Pet.equals("") || Pet.equals(" ")) {
            Pet = "Pet Rock";
        }


// end of the main conditional. 



        //make sure the input is valid (Idiot proof!)
        //make a decision 
        //tell the user they get!
        
      
        


    }
}



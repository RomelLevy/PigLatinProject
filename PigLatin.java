import java.util.Scanner; //importing scanner

public class PigLatin { //This program translates words into pig Latin.

    public static void main(String[] args) { //main method
        
    	Scanner in = new Scanner(System.in); //scanner
       
        System.out.println("please enter a word"); //prompt for user to input word
        String engWord = in.nextLine();           //get user input
        
        System.out.println("The word you passed is : " + pigSentence(engWord) + " in Pig Latin!");
        // output of word translated to pig Latin


    }

    private static String pigSentence(String word) { //method

        char startLetter = word.charAt(0);
        
         //if else statement to perform function of adding "ay" to the end of word to pig Latin.
        if (startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o' || startLetter == 'u') {
                
        	word = word.concat("yay"); 

        } else {
            String startconso = "";
            
            if (word.charAt(1) == 'h') {        
                startconso = word.substring(0, 2);
                word = word.concat(startconso).concat("ay");
                word = word.substring(2);
            } else {
                startconso = String.valueOf(startLetter);
                word = word.concat(startconso).concat("ay");
                word = word.substring(1);
            }

        }
        return word; //return translated word.
    }

}
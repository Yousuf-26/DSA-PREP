
/**
 * Write a description of class SubSequence here.
 *
 * @author (Yousuf Borna)
 * @version (6/9/2024)
 */
public class SubSequence
{
   public static void main (String args[]){
    
    System.out.println("skipCharacters as 'a' ");  
    String processed ="";
    String unprocessed ="abaccsx";
    skipCharacter(processed,unprocessed);
    
    }
    
    public static void skipCharacter(String processed, String unprocessed){
        
        if(unprocessed.isEmpty()){
           System.out.println(processed);
           return;
        }
        
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
        
           skipCharacter(processed,unprocessed.substring(1));
        }else{
        
           skipCharacter(processed+ch,unprocessed.substring(1));         
        }
    }
}

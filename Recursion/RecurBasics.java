
/**
 * Write a description of class RecurBasics here.
 *
 * @author (Yousuf Borna)
 * @version (6/8/2024)
 */
public class RecurBasics
{
    public static void main(String args[]){
    
       
        System.out.println("Print ALL Natural numbers");
        int number = 6;
        printAllNaturalNumbers(number);        
    }
    
    /*
     * QUESTION - PRINT ALL THE NATURAL NUMBERS FROM 1 TO N USING RECURSION
    */
   
   public static void printAllNaturalNumbers(int n){
    
       if(n == 0){
           return;
        }
        
        printAllNaturalNumbers(n-1);
        System.out.print(n+" ");
    
    }
}

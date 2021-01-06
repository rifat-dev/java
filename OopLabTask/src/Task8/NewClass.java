
package Task8;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Md Rifat
 */
public class NewClass {
    public static void main(String[] args) {
        try { 
            int a = 30, b = 0; 
            int c = a/b;  
            System.out.println ("Result = " + c); 
        } 
        catch(ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0"); 
        } 
        
        try { 
  
          
            File file = new File("E://file.txt"); 
  
            FileReader fr = new FileReader(file); 
        } catch (FileNotFoundException e) { 
           System.out.println("File does not exist"); 
        } 
        
        try { 
           
            int num = Integer.parseInt ("akki") ; 
  
            System.out.println(num); 
        } catch(NumberFormatException e) { 
            System.out.println("Number format exception"); 
        } 
        
        
    }
}

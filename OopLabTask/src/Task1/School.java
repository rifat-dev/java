
package Task1;

/**
 *
 * @author Md Rifat
 */
public class School {
    public static void main(String[] args) {
        Teachers teacher1=new Teachers("Rifat","mdrifat@gmail.com","Math","Morning",8);
        teacher1.info();
        teacher1.workingDetails();
  
        
        System.out.println();
        System.out.println();
        
        Teachers teacher2=new Teachers("Aktaruzzaman Paramanik","paramanik@gmail.com","OOP","Morning",10);
        teacher2.info();
        teacher2.workingDetails();
    }
}

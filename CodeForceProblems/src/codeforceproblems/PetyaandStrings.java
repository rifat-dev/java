

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a,b;
        a=sc.nextLine().toLowerCase();
        b=sc.nextLine().toLowerCase();
        if(a.compareTo(b)==0){
            System.out.println("0");
        }else if(a.compareTo(b)<0){
            System.out.println("-1");
        }else if(a.compareTo(b)>0){
            System.out.println("1");
        }
        
    }
}

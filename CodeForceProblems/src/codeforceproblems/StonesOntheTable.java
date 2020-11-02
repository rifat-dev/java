

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class StonesOntheTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int numOfChar=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char[]ch=s.toCharArray();
        
        
        for (int i = 0; i <numOfChar-1 ; i++) {
            if(ch[i]==ch[i+1]){
                count++;
            }
        }
        
        if(count==numOfChar){
            System.out.println(count-1);
        }else{
            System.out.println(count);
        }
        
        
    }
}

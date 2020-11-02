

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String word=sc.nextLine();
        char ch[]=word.toCharArray();
        
        int a=(int)ch[0];
        if(a>90){
            ch[0]=(char) (a-32);
        }
         
        for (int i = 0; i <ch.length; i++) {
            System.out.print(ch[i]);
        }
        
    }
}

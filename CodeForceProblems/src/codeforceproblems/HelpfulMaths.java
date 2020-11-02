

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        if(ch.length!=1){
            for (int i = 0; i <ch.length-2; i+=2) {
               for (int j = 0; j <ch.length-2; j+=2) {
                   if(ch[j]>ch[j+2]){
                     int temp = ch[j];
                     ch[j]=ch[j+2];
                     ch[j+2]=(char) temp;
                   }
               }
           }
        }else{
            System.out.println(ch[0]);
            System.exit(0);
        }
        
        for (int i = 0; i <ch.length; i++) {
            System.out.print(ch[i]+"");
        }
    }
}

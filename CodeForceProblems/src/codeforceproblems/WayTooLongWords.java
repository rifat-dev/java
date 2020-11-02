

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <n; i++) {
            String word=sc.nextLine();
            char array[]=word.toCharArray();
        
           if(array.length>10){
               char a=array[0];
               char b=array[array.length-1];
               int num=array.length-2;
               System.out.println(a+""+num+""+b);
           }else{
              System.out.println(word);
           }
        }
        
    }
}

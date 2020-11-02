


import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        int x=0;
        for (int i = 0; i <n; i++) {
          String s=sc.nextLine();
          char ch[]=s.toCharArray();
          for (int j = 0; j <ch.length; j++) {
              if(j==1){
                  if(ch[j]=='+'){
                      x++;
                  }else{
                      x--;
                  }
              }
          }
            
        }
 
        System.out.println(x);
       
    }
}

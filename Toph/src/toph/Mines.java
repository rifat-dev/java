
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Mines {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        int r,c;
        r=in.nextInt();
        c=in.nextInt();
        int count=0;  
        char a[][]=new char[25][25];
       
          for (int i = 0; i <r; i++) {
	            String m = in.next();
	            int k = 0;
	            for (int j = 0; j <c; j++) {  //directly putting data into tha safety box
	                a[i][j] = m.charAt(k);
	                k++;
	            }
	        }
          
          for (int i = 0; i <r; i++) {
              for (int j = 0; j <c; j++) {
                  if(a[i][j]=='.'){
                      if(a[i+1][j]=='*'){
                          count++;
                      } if(a[i-1][j]=='*'){
                          count++;
                      }if(a[i][j +1]=='*'){
                          count++;
                      }if(a[i][j -1]=='*'){
                          count++;
                      }if(a[i+1][j +1]=='*'){
                          count++;
                      }if(a[i+1][j -1]=='*'){
                          count++;
                      }if(a[i-1][j +1]=='*'){
                          count++;
                      }if(a[i-1][j -1]=='*'){
                          count++;
                      }
                  }
                  if(count>0){
                      a[i][j]= (char) count;
                      count=0;
                  }
                  
              }
        }
          
          for (int i = 0; i < r; i++) {
              for (int j = 0; j < c; j++) {
                  System.out.println(a[i][j]);
              }
        }
        
    }
}

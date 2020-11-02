
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row = 0,col = 0,result;
        int mat[][]=new int[5][5];
        for (int i = 0; i <mat.length; i++) {
              for (int j = 0; j <mat.length; j++) {
                mat[i][j]=sc.nextInt();
            }
   
        }
        
        if(mat[2][2]!=1){
            for (int i = 0; i <mat.length; i++) {
                for (int j = 0; j <mat.length; j++) {
                    if(mat[i][j]==1){
                         row=i;
                         col=j;
                         break;
                    }
                }
            }
        }else{
            System.out.println(0);
            exit(0);
        }
        
       

        int a=3-(row+1);
        int b=3-(col+1);
    
        if((a<=0)||(b<=0)){
            if((a<=0)&&(b<=0)){
               result = Math.abs(a)+Math.abs(b);
                System.out.println(result);
            }
            else if(a<0){
                result= Math.abs(a)+b;
                System.out.println(result);
            }else{
                 result=a+Math.abs(b);
                System.out.println(result);
            }
        }else{
            result=a+b;
            System.out.println(result);
        }
       
    }
}


import java.util.Scanner;


public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        for (int i = year+1; i <10000; i++) {
            String s = String.valueOf(i);
            int notMatch=0;
            for (int j = 0; j <s.length(); j++) {  
                  char ch = s.charAt(j);
                for (int k = j+1; k <s.length(); k++) {
                    if(ch==s.charAt(k)){
                        notMatch++;
                    }                 
                }
            }
            if(notMatch==0) {
                System.out.println(i);
                break;
            }else{
                notMatch=0;
            }
            
        }
    }
}

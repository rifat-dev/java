/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class IncompatibleCrops {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r,c;
        r=in.nextInt();
        c=in.nextInt();
        int count=0;  
        char a[][]=new char[r][c];
       if((0<r)&&(r<25)&&(0<c)&&(c<25)){
          for (int i = 0; i <r; i++) {
	            String m = in.next();
	            int k = 0;
	            for (int j = 0; j <c; j++) {  //directly putting data into tha safety box
	                a[i][j] = m.charAt(k);
	                k++;
	            }
	        }
        }else{
           System.exit(0);
       }
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                if(a[i][j]!='*'){
                   if((r>1)&&(c>1)){
                       if((1<=i)&&(i<r-1)&&(1<=j)&&(j<c-1)){
                    if(((a[i][j-1])!='*') && ((a[i-1][j])!='*')&&((a[i][j+1])!='*') && ((a[i+1][j])!='*')){
                    count++;
                    }
                  }else if((i==0)&&(j==0)){
                      if((a[i][j+1]!='*')&&(a[i+1][j]!='*')){
                          count++;
                      }
                  }else if((i==0)&&(j==c-1)){
                      if((a[i][j-1]!='*')&&(a[i+1][j]!='*')){
                      count++;
                  }
                  }else if((i==r-1)&&(j==0)){
                      if((a[i-1][j]!='*')&&(a[i][j+1]!='*')){
                          count++;
                      }
                  }else if((i==r-1)&&(j==c-1)){
                      if((a[i-1][j]!='*')&&(a[i][j-1]!='*')){
                          count++;
                      }
                  }else if((i==0)&&(1<=j)&&(j<c-1)){
                      if((a[i][j-1]!='*')&&(a[i][j+1]!='*')&&(a[i+1][j]!='*')){
                          count++;
                      }
                  }else if((j==0)&&(1<=i)&&(i<r-1)){
                      if((a[i-1][j]!='*')&&(a[i+1][j]!='*')&&(a[i][j+1]!='*')){
                          count++;
                      }
                  }else if((i==r-1)&&(1<=j)&&(j<c-1)){
                      if((a[i][j-1]!='*')&&(a[i][j+1]!='*')&&(a[i-1][j]!='*')){
                          count++;
                      }
                  }else if((j==c-1)&&(1<=i)&&(i<r-1)){
                      if((a[i-1][j]!='*')&&(a[i+1][j]!='*')&&(a[i][j-1]!='*')){
                          count++;
                      }
                  }else{
                      break;
                  }
                   }else{
                       if((r==1)&&(c==1)){
                           if((i==0)&&(j==0)){
                               count++;
                           }
                       }
                       
                       else if(r==1){
                           if((i==0)&&(j==0)){
                               if((a[i][j+1]!='*')){
                                   count++;
                               }
                           }else if((i==0)&&(j==c-1)){
                               if((a[i][j-1]!='*')){
                                   count++;
                               }
                           }else if((i==0)&&(0<j)&&(j<c-1)){
                               if((a[i][j-1]!='*')&&(a[i][j+1]!='*')){
                                    count++;
                               }
                           }
                           
                       }else{
                            if((i==0)&&(j==0)){
                                if((a[i+1][j]!='*')){
                                   count++;
                               }
                           }else if((j==0)&&(i==r-1)){
                               if((a[i-1][j]!='*')){
                                   count++;
                               }
                           }else if((j==0)&&(0<i)&&(i<r-1)){
                               if((a[i-1][j]!='*')&&(a[i+1][j]!='*')){
                                    count++;
                               }
                           }
                       }
                   }
               }
            }
        }
        System.out.println(count);
    }
}

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
public class BPLMubarak {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int count=0;
        int T=n.nextInt();
        n.nextLine();
        for (int i = 0; i <T; i++) {
            String str=n.nextLine();
            char a[]=str.toCharArray();
            for (int j = 0; j <a.length; j++) {
                if((a[j]!='W') && (a[j]!='N')&&(a[j]!='D')){
                       count++;
                }else{
                    continue;
                }
            }
            if(count<6){
                if(count==1){
                    System.out.println("1 BALL");
                }else{
                    System.out.println(count+" BALLS");
                }
            }else{
                if(count%6==0){
                    int k=count/6;
                    if(k==1){
                        System.out.println("1 OVER");
                    }else{
                        System.out.println(k+" OVERS");
                    }
                }else{
                    int over=count/6;
                    int totall=over*6;
                    int ball=count-totall;
                    if(over==1){
                        if(ball==1){
                            System.out.println(over+" OVER "+ball+" BALL");
                        }else{
                            System.out.println(over+" OVER "+ball+" BALLS");
                        }
                    }else{
                        if(ball==1){
                            System.out.println(over+" OVERS "+ball+" BALL");
                        }else{
                            System.out.println(over+" OVERS "+ball+" BALLS");
                        }
                    }
                }
            }
            count=0;
        }
    }
}

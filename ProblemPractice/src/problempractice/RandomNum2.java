/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problempractice;

/**
 *
 * @author Md Rifat
 */
public class RandomNum2 {
    public static int grtRandom(int min,int max){
        int x=(int)(Math.random()*((max-min)+1))+min;
        return x;
    }
    public static void main(String[] args) {
        int n=grtRandom(1000,9999);
        System.out.println(n);
    }
}

package LabFinal;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class NewClass {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         String movieName;
         String heroName ;
         String herionName;
        Movie movie = new Movie();//create class obj
        
        //take inpute from user 
        System.out.println("Movie Name");//inpute movie name
         movieName = sc.nextLine();
        System.out.println("Hero Name");//inpute hero name
         heroName = sc.nextLine();
        System.out.println("Herion Name");// inpute herion name
        herionName = sc.nextLine();
        
        // set value 
        movie.setMovieName(movieName);
        movie.setHeroName(heroName);
        movie.setHeroinName(herionName);
        
        
        // call class methode 
        movie.movieInfo();
        
       Receptionist rec = new Receptionist(123);     
       rec.login();
        
    }
}


package LabFinal;

public class Movie {
    private String movieName;
    private String heroName;
    private String heroinName;

    public Movie(String movieName, String heroName, String heroinName) {
        this.movieName = movieName;
        this.heroName = heroName;
        this.heroinName = heroinName;
    }
    public Movie() {
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroinName() {
        return heroinName;
    }

    public void setHeroinName(String heroinName) {
        this.heroinName = heroinName;
    }
    
    public void movieInfo(){
        System.out.println("Name Of movie : "+this.movieName);
        System.out.println("Hero Name "+this.heroName);    
    }
   
    
}

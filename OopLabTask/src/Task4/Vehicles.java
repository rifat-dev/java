
package Task4;
public class Vehicles {
 
    protected String name;
    protected String model;

    public Vehicles(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Vehicles() {
    }
    
    
    
    public void run(){
        System.out.println("Every vehicles run on the road");
    }
    public void stop(){
        System.out.println("Every vehicls can stop");
    }
}

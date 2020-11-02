
package Task4;

import java.util.Scanner;

public class Car extends Vehicles {
    Scanner sc=new Scanner(System.in);
    private String color;
    private int quantity;

    public Car(String color, int quantity, String name, String model) {
        super(name, model);
        this.color = color;
        this.quantity = quantity;
    }

    public Car() {
    }
    
    public void takeInput(){
         System.out.println("Enter Car Company name");
         this.name=sc.nextLine();
         System.out.println("Enter Car Model");
         this.model=sc.nextLine();
         System.out.println("Enter Car Color");
         this.color=sc.nextLine();
         System.out.println("Enter Quantity Of Cars");
         this.quantity=sc.nextInt();
         
    }
    
    public void output(){
        System.out.println("Company Name: "+this.name
                +"\n"+"Car Model : "+this.model
                +"\n"+"Car color : "+this.color+
                "\n"+"Quantity Of cars: "+this.quantity);
    }

}


package Lab2;


public class Dog implements InterfaceAnimal{
    private String color;
    private String gender;

    public Dog(String color, String gender) {
        this.color = color;
        this.gender = gender;
    }
    
    public Dog() {
    }

    @Override
    public void sound() {
        System.out.println("All Dog Sounds Ghew Ghew....");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public void display(){
        System.out.println("Body Color is : "+this.color);
        System.out.println("Gog Gender is : "+this.gender);
    }
    

    
    
    
    
}

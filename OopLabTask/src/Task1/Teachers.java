
package Task1;

/**
 *
 * @author Md Rifat
 */
public class Teachers {
    private String name;
    private String email;
    private String subject;
    private String shift;
    private int time;


    public Teachers(String name,String email, String subject, String shift, int time) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.shift = shift;
        this.time = time;
    }
    
    void info(){
        System.out.println("Teacher Name Is : "+name);
        System.out.println("Mr "+name+" Email Is "+email);
    }
    void workingDetails(){
         System.out.println("Mr "+name+" Teaches "+subject+" Subject");
         System.out.println("Mr "+name+" Taking Class In The "+shift+" At "+time+" Am");
    }
       
}

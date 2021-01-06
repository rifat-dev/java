
package LabFinal;

/**
 *
 * @author Md Rifat
 */
public class Receptionist implements LoginInterface {
     private int pass;

    public Receptionist(int pass) {
        this.pass = pass;
    }
    

    @Override
    public void login() {
         //To change body of generated methods, choose Tools | Templates.
         if(pass==123){
             System.out.println("Login Success");
         }
         
    }

    @Override
    public void loginWithTwoFactorAuthentication() {
          //To change body of generated methods, choose Tools | Templates.
          
    }
    
}

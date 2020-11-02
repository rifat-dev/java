
package anisulislamjava._85OOP;


public class Teacher {
    String name,gender;
    int id;
    
    
    Teacher(String n,String g,int i ){
        name=n;
        gender=g;
        id=i;
    }
    
    void show(){
         System.out.println("Name : "+name);
         System.out.println("Gender : "+gender);
         System.out.println("Id : "+id);
    }
}

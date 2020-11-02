/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primsAlgo;

public class vertex {

   
    public int name;
    public int key;
    public int parent;
    public boolean checked;
    
    public vertex(int n,int k,int p,boolean c){
        name=n;
        key=k;
        parent=p;
        checked=c;
        
    }
}

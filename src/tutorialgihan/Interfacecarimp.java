/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Interfacecarimp implements InterfaceCar{

    @Override
    public void topSpeed() {
       // my codes 
    }

    @Override
    public void color() {
        //my codes
    }
    public static void main(String[] args) {
        Interfacecarimp impl =new Interfacecarimp();
        impl.color();
    }
    
}

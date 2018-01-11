/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;


public class Enum {
    
    
    enum Power{
    
    strong(2),moderate(4),weak(6);
    
    int strength;
    
    private Power(int i){
        strength=i;
    }
    
    public int getPower(){
        return strength;
    }
    
    }
    public void display(){
        Power play1=Power.moderate;
        Power play2=Power.weak;
        Power play3=Power.strong;
        
        for(Power temp: Power.values()){
            System.out.println("The value is: "+ temp);
    }
    }
    public void displaygetpower(){
        Power play1=Power.moderate;
        Power play2=Power.weak;
        Power play3=Power.strong;
        
        System.out.println("The Strength of the player is: "+play1.getPower());
    }
    }



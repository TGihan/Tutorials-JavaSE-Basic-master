/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

/**
 *
 * @author Dell
 */
public class Finalc {
    private int sum;
    private final int NUMBER;
    
    public Finalc(int x){
    NUMBER=x;
    }
    public void add(){
    sum+=NUMBER;
    }
    public String tostring(){
    return String.format("sum = %d\n",sum);
    }
    
}

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author Dell
 */
public class WriteFile1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File happy=new File("C:\\happy.txt");
        try (PrintStream stream = new PrintStream(happy)) {
            if(happy.exists()==false){
            happy.createNewFile();
                System.out.println("File created");
                
            }else{
                System.out.println("file exist");
            }
            stream.print("Hello this is first file write");
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author Dell
 */
public class AppendFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File happy=new File("C:\\happy.txt");
        FileWriter fw=new FileWriter(happy,true);
        BufferedWriter buff=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(buff);
        
            if(happy.exists()==false){
            happy.createNewFile();
                System.out.println("File created");
                
            }else{
                System.out.println("file exist");
            }
            pw.print("Hello this is second append text");
        pw.close();
    }
            
}

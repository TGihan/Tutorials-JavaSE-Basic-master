/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class appendtxt {
    
    public void append(){
    try
{
    String filename= "MyFile.txt";
    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
    fw.write("add a line\n");//appends the string to the file
    fw.close();
}
catch(IOException ioe)
{
    System.err.println("IOException: " + ioe.getMessage());
}
    }
}

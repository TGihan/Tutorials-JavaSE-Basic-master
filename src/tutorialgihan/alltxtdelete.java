/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialgihan;

import java.io.File;

/**
 *
 * @author Dell
 */
public class alltxtdelete {
    

    public alltxtdelete() {
        String dir="F:\\Netbeans Projects\\Camera\\";
         // Lists all files in folder
        // Lists all files in folder
        File folder = new File(dir);
        File fList[] = folder.listFiles();
        // Searchs .log
        for (int i=0; i < fList.length; i++) {
        String pes = String.valueOf(fList[i]);
        if (pes.endsWith(".log")) {
        // and deletes
        fList[i].delete();
    }
    
}
    }
}

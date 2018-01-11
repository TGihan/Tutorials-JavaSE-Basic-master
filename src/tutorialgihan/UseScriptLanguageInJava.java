/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorialgihan;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Gihan Herath
 */
public class UseScriptLanguageInJava {

   
    public static void main(String[] args) throws ScriptException {
         
        //use javascript in java
         ScriptEngineManager sem=new ScriptEngineManager();
         ScriptEngine op=sem.getEngineByName("javascript");
         op.eval("print('hello java script')");
     
        
    }
    
}

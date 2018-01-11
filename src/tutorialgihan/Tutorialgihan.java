
package tutorialgihan;

import java.util.Scanner;
import javax.swing.*;

public class Tutorialgihan {

   
    public static void main(String[] args) {
 
        Scanner input=new Scanner(System.in);    //create new scanner(this scanner can be use for many task within main class)
 /*
        //class get user input
       Userin userinobj = new Userin(); //create object within userin class
       userinobj.userinput();   //call it method
       
       //above method is not return statement it can be call directly with object
       
       
       //class multi class call withing main class
       Multicls multiclsobj =new Multicls();    //create object withing multicls class
       multiclsobj.calanoclas();    //call it method
              
       //class method with parameter
       Mthdpara methodparaobj = new Mthdpara(); //create new object within mthdpara class
       System.out.println("Enter Your name ");  
       String name=input.nextLine();    //user input stored string name parameter
       methodparaobj.methodpara(name);  //call the methodpara method
       
       //class many method with instance
       Mmthdinst mthdinstanceobj =new Mmthdinst();
       System.out.println("Enter your first gf name ");
       String temp=input.nextLine();    //use input scanner for get input and it set to temp variable 
       mthdinstanceobj.setname(temp);   //call setname method it's name parameter set to temp
       mthdinstanceobj.sayname();   //call sayname method
    
       //class constructors
       Constructors consobj1 =new Constructors("Ishara");    //create object with constructor within class constructors
       consobj1.sayname();   //call method within object1
       Constructors consobj2 =new Constructors("Dinusha");    //create another object with constructor 
       consobj2.sayname();   //call method within object2
       
       //class nested if statements
       Nestif nesifobj =new Nestif();   //create object within nestif class
       nesifobj.nestifstat();   //call mit's methods
       
       //class else if statement
       Elseif elseifobj =new Elseif();  //create object within elseif class
       elseifobj.elseifstat();  //call it's method
       
       //class condional operator
       Condopera condopobj=new Condopera(); //create object within condopera class
       condopobj.condiopera();  //call it's method
       
       //class Simple average proramme use while loop
       Simpaverage simavgobj=new Simpaverage(); //create object within simple average class
       simavgobj.simpleaverage();   //call it's method
       
       //class for loop
       Forloop forlopobj =new Forloop();    //create object within forloop class
       forlopobj.forlop();  //call it's methods
       
       //class maths power using
       Matpower mathpowobj=new Matpower();  //create object within mathpower class
       mathpowobj.mathpower();  //call it's method
       
       //class Do while loop
       Dowhile dwlopobj=new Dowhile();  //create object within do while class
       dwlopobj.dwhilelop();    //call it's method
       
       //class math functions
       Mathcls mathobj =new Mathcls();  //create object within math class
       mathobj.mathmthds(); //call it's method
       
       //class Random number gernerator
       Rannum randomobj=new Rannum();   //create object within random num class
       randomobj.randomnumber();    //call it's method
       
       //class introduction to array
       Introarray intarrobj1=new Introarray();   //create object within intro array
       intarrobj1.intarry1(); //call it's method
       Introarray intarrobj2=new Introarray();  //create second object 
       intarrobj2.intarry2();   //call second method
       
       //class array table
       Arrytble arrytbobj=new Arrytble();   //create object within array table class
       arrytbobj.arrytable();   //call it's method
       
       //class sumation of array indexes
       Sumarry sumaryobj=new Sumarry(); //create object within sum array class
       sumaryobj.sumary();  //call it's method
       
       //class enhanced for loop this is very easy to suma array elements
       Enhancefor enhforobj=new Enhancefor();   //create object within enhancd for loop class
       enhforobj.enhanfor();    //call it's method
       
       //class change array elements by value 
       Chngearryelm charyobj=new Chngearryelm();    //create object within change array class
       charyobj.change();   //call it's method
       
       //class multi dimentional array
       Multiarray mularyobj=new Multiarray();   //create object within muti array class
       mularyobj.mulary();  //call it's method
       
       //class time class format method
       Timecls timeobj=new Timecls();   //create object within time class
       timeobj.display(); //call it's display method
       
       //class overload constructor
       Ovloconst overobj1=new Ovloconst();  //create object within overload class and call default constructor
       Ovloconst overobj2=new Ovloconst(4); //create object within overload class and call 2 constructor
       Ovloconst overobj3=new Ovloconst(5,34);  //create object within overload class and call 3 constructor
       Ovloconst overobj4=new Ovloconst(3,23,45);   //create object within overload class and call 4 constructor
       
       System.out.printf("%s\n",overobj1.toformat());   //print and format
       System.out.printf("%s\n",overobj2.toformat());   //return methods only call within runtime printf
       System.out.printf("%s\n",overobj3.toformat());
       System.out.printf("%s\n",overobj4.toformat());
    
       //class to string
       
       //Tostring tostrobj=new Tostring(3,4,6);   //create object and pass arguments for constructor
       //Composition  comobj=new Composition("Gihan",tostrobj);   //another class object get into argument
       
       
       //class static
       Statics staticobj1=new Statics("Tharindu","Gihan");      //call statics constructor by passing values
       Statics staticobj2=new Statics("Dulanjali","Sewwandhi");
       
       System.out.println();
       
       //static not change now it value is 3 we get that by method calling
       System.out.println(Statics.getmembers());    //return methods only call within runtime printf
       //static return methods can be only call by constructor
       //but normal string or int etc return methods can be call by object 
       
       
       //class final
       
       //Finalc finalobj=new Finalc(10);
        
       //for(int i=0;i<5;i++){    //loop object
       //finalobj.add();
       //System.out.printf("%s",finalobj);
       
       
       //class inheritance inheritsub class
       Inheritsub1 insubobj1=new Inheritsub1();
       Inheritsub2 insubobj2=new Inheritsub2();
       
       insubobj1.eat();     //overided method that method change default setting of that method
       insubobj2.eat();
       
       //class GUI JOptionpane
       Joptpane joptobj=new Joptpane(); //create object within joptionpane class
       joptobj.startoption();   //call it's method
       
       //class jframe
       Jframe jfrobj=new Jframe();
       jfrobj.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);   //set jframe close operation 
       jfrobj.setSize(800,600);     //set jframe sixe
       jfrobj.setVisible(true);     //show jframe
    
       //class  event handling
       Eventh evobj=new Eventh();
       evobj.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);   //set jframe close operation 
       evobj.setSize(275,180);     //set jframe sixe
       evobj.setVisible(true);     //show jframe
       
       //class introduction to polymorphisam
       Polymor1 poly[]=new Polymor1[2]; //create array with 2 elements for polymor1 super class
       poly[0]=new Polymor2();  //array element 0 to polymor2 sub class
       poly[1]=new Polymor3();  //array element 1 to polymor3 sub class
       
       for(int x=0;x<2;++x){    //loop use for  array elements call same eat method
       poly[x].eat();
       }
       
       //class polymorphic arguments
       Polyargu ply=new Polyargu(); //create object within plymorphic with arguments class
       Polymor1 plyobj=new Polymor1();      //polymorphic argument class has polymor1 classobj as  argument, declare this obj to it
       Polymor2 plyobj1=new Polymor2();     //polymorphic argument class has polymor2 classobj as  argument, declare this obj to it
       
       ply.digest(plyobj);      //calling method digest with polymor1 obj as argument
       ply.digest(plyobj1);     //calling method digest with polymor1 obj as argument
       
       //class abstract 
       //can't create object within abstract class
       
       //class array holding many objects
       Holdobject ho=new Holdobject();      //create object within holdobject class
       ho.displaylist();    //call it's method
       
       //class Simple Polymorphi Programe
       Holdobjectp hopobj=new Holdobjectp();    //create object within holdobjectp class
       hopobj.displayhop(); //call it's method
       
       Jbutton jbobj=new Jbutton();
       jbobj.setDefaultCloseOperation(Jbutton.EXIT_ON_CLOSE);   //set jframe close operation 
       jbobj.setSize(275,180);     //set jframe sixe
       jbobj.setVisible(true);
       
   
       //class JCheck box
       Jcheckbox jchobj=new Jcheckbox();
       jchobj.setDefaultCloseOperation(Jcheckbox.EXIT_ON_CLOSE);
       jchobj.setSize(200, 200);
       jchobj.setVisible(true);
    
       //class JRadio button
       Jradiobutton jrbobj=new Jradiobutton();
       jrbobj.setDefaultCloseOperation(Jradiobutton.EXIT_ON_CLOSE);
       jrbobj.setSize(500, 200);
       jrbobj.setVisible(true);
     
       //class Jcombo box
       Jcombobox jcbobj=new Jcombobox();
       jcbobj.setDefaultCloseOperation(Jcombobox.EXIT_ON_CLOSE);
       jcbobj.setSize(200, 100);
       jcbobj.setVisible(true);
       
       //class Jlist box
       Jlistbox jlbobj=new Jlistbox();
       jlbobj.setDefaultCloseOperation(Jlistbox.EXIT_ON_CLOSE);
       jlbobj.setSize(200, 200);
       jlbobj.setVisible(true);
       
       //class Jlist box move items
       Jlistmove jlbmobj=new Jlistmove();
       jlbmobj.setDefaultCloseOperation(Jlistmove.EXIT_ON_CLOSE);
       jlbmobj.setSize(400, 200);
       jlbmobj.setVisible(true);
       
       //class mouse event handling
       Mouseevent moevobj=new Mouseevent();
       moevobj.setDefaultCloseOperation(Mouseevent.EXIT_ON_CLOSE);
       moevobj.setSize(500,200);
       moevobj.setVisible(true);
       
       //class File 
       Fileclass fileobj=new Fileclass();
       fileobj.display();
       
       //class create file
       Createfile crfobj=new Createfile();
       crfobj.dislay();
       
       //class write file
       Writefile wrfobj=new Writefile();
       wrfobj.openFile();
       wrfobj.addRecords();
       wrfobj.closeFile();
       */
        /*
       //class read file
       Readfile rfobj=new Readfile();
       rfobj.openFile();
       rfobj.readFile();
       rfobj.closeFile();
       /*
       //class Exception handling 
       Excephand exhobj=new Excephand();
       exhobj.display();
       
       //class Flowlayout
       Flowlayout flobj=new Flowlayout();
       flobj.setDefaultCloseOperation(Flowlayout.EXIT_ON_CLOSE);
       flobj.setSize(500,200);
       flobj.setVisible(true);
       */
       //class graphic examples
       JFrame f=new JFrame("Hello Graphics");
       Graphicex grpobj=new Graphicex();
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.add(grpobj);
       f.setSize(500,200);
       f.setVisible(true);
       /*
       //class String all
       Stringall strobj=new Stringall();
       strobj.display();
       
       //class recursion
       Recur recurobj=new Recur();
       recurobj.display();
       
       //class collection
       Collect colobj=new Collect();
       colobj.display();
       
       //class Linked list
       Linklist linkobj=new Linklist();
       linkobj.display();
       
       //class convert list to array
       Convertlisttoarray convertobj=new Convertlisttoarray();
       convertobj.display();
       
       //class collection method sort
       Collectionmthdsort colobj=new Collectionmthdsort();
       colobj.display();
       
       //class method reverse and copy
       Mthdreverscopy mthdobj=new Mthdreverscopy();
       mthdobj.display();
       
       //class addall collection
       Addall addallobj=new Addall();
       addallobj.display();
       
       //class collection frequency and disjoint 
       Frequencydisjoint freobj=new Frequencydisjoint();
       freobj.display();
       
       //class stack push and pop
       Stackpushpop staobj=new Stackpushpop();
       staobj.display();
       
       //class Queuee
       Queuee quobj=new Queuee();
       quobj.display();
       
       //class Hashset duplicate index finder
       Hashset hsobj=new Hashset();
       hsobj.display();
       
       //class generic method easyway to without overiding
       Genericmthd geobj=new Genericmthd();
       geobj.display();
       
       //class gemeric method implementation
       Implementgenericmthd imobj=new Implementgenericmthd();
       imobj.display();
       
       //class generic methods return types
       Genericreturn genereturnobj=new Genericreturn();
       genereturnobj.display();
       
       //class introduction to applet
       Introapplet apobj=new Introapplet();
       
       //class drawing oval with slider
       Ovalwindow winobj=new Ovalwindow();
       winobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       winobj.setSize(230, 230);
       winobj.setVisible(true);
       
       //class thread example
       Thread thobj1=new Thread(new Threade("one"));
       Thread thobj2=new Thread(new Threade("two"));
       Thread thobj3=new Thread(new Threade("three"));
       Thread thobj4=new Thread(new Threade("four"));
       
       thobj1.start();
       thobj2.start();
       thobj3.start();
       thobj4.start();
       //*//*
       //class enum
       Enum e=new Enum();
       e.display();
       e.displaygetpower();*/
        
       // appendtxt a=new appendtxt();
        //a.append();
    }
    }

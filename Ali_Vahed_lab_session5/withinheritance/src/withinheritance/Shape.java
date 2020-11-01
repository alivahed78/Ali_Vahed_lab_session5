/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withinheritance;
import java.lang.Math.*;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Shape {
   double Perimeter,Area;
   ArrayList<Integer> sidesofrectangle = new ArrayList<Integer>();
    ArrayList<Integer> sidesoftriangle = new ArrayList<Integer>();
    int radius,sr1,sr2,sr3,sr4;
    int st1,st2,st3;
    
    public Shape(){
        
       sidesofrectangle.add(sr1);
       sidesofrectangle.add(sr2);
       sidesofrectangle.add(sr3);
       sidesofrectangle.add(sr4);
       
       sidesoftriangle.add(st1);
       sidesoftriangle.add(st2);
       sidesoftriangle.add(st3);
    }
    
    public int claculatePerimeterofCircle(){
        Perimeter = (Math.PI * radius);
        System.out.printf("Perimeter is %d",Perimeter);
        return 0;
    }
    public int calculateAreaofCircle(){
       Area = (Math.PI * radius * radius);
       System.out.printf("Area is %d",Area);  
       return 0;  
    }
    
    public int calculatePerimeterofRectangle(){
       Perimeter = 2*(sr1+sr2);
       System.out.printf("Perimeter is %d",Perimeter);
       return 0;    
    }
    public int calculateAreaofRectangle(){
       Area = sr1 * sr2;
       System.out.printf("Area is %d",Area); 
       return 0;      
    }
    public int calculatePerimeterofTriangle(){
       Perimeter = st1 + st2 + st3;
       System.out.printf("Perimeter is %d",Perimeter); 
       return 0; 
    }
    
    public int calculateAreaofTriangle(){
        Perimeter = st1 + st2 + st3;
        int s = (int) (Perimeter/2);
        double a;
        a = s*(s-st1)*(s-st2)*(s-st3);
        
        Area = Math.sqrt(a);
        System.out.printf("Area is %f",Area);
        return 0;
    }
    
    
}

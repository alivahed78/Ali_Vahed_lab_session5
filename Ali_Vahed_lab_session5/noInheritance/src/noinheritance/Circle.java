/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noinheritance;

import java.lang.Math.*;
/**
 *
 * @author user
 */
public class Circle {
    Integer radius;
    double Perimeter;
    double Area;
    public Circle(int radius){
      radius = 0 ;  
    }
    public void getradius(int radius){
        this.radius = radius;
    }
    
    public int calculatePerimeter(){
        Perimeter = (Math.PI * radius);
        System.out.printf("Perimeter is %d",Perimeter);
        return 0;
    }
    public int calculateArea(){      
        Area = (Math.PI * radius * radius);
        System.out.printf("Area is %d",Area);
        return 0;
    }
    public String draw(){
        System.out.println("Shape is Circle");
        System.out.printf("Perimeter is %f:",Perimeter);
        System.out.printf("Area is %f:",Area);
        return null;
    }
    
    public void equals(Circle c,Triangle t,Rectangle r){
        if(c.equals(t) || c.equals(r)){
            System.out.println("They are equals.");
        }
    }
    
    public String toString(){
        System.out.println(radius.toString());
        System.out.println(Circle.class.toString());
        return null;
    }
}

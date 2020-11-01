/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noinheritance;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Rectangle {
    ArrayList<Integer> sides = new ArrayList<Integer>();
    int s1,s2,s3,s4;
    int Perimeter,Area;
    public Rectangle(int s1, int s2, int s3, int s4){
        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
        sides.add(s4);
    }
    
    public void getside(){
        this.sides = sides;
    }
    
    public void isSquare(){
        if(s1 == s2 && s1 == s3 && s1 == s4 && s2 == s3 && s2 == s4 && s3 == s4){
            System.out.println("It is Square");
        }
    }
    
    public void calculatePerimeter(int s1, int s2){
        Perimeter = 2*(s1+s2);
        System.out.printf("Perimeter is %d",Perimeter);
    }
    
    public void calculateArea(int s1, int s2){
        Area = s1 * s2;
        System.out.printf("Area is %d",Area);
    }
    
    public String draw(){
        System.out.println("Shape is Rectangle");
        System.out.printf("Perimeter is %d:",Perimeter);
        System.out.printf("Area is %d:",Area);
        return null;
    }
    
    public void equals(Circle c,Triangle t,Rectangle r){
        if(r.equals(t) || r.equals(c)){
            System.out.println("They are equals.");
        }
    }
    
    public String toString(){
        System.out.println(sides.toString());
        System.out.println(Rectangle.class.toString());
        return null;
    }
}

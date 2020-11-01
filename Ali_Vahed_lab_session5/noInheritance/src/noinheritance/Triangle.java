/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noinheritance;
import java.util.ArrayList;
import java.lang.Math;
/**
 *
 * @author user
 */
public class Triangle {
    ArrayList<Integer> sides = new ArrayList<Integer>();
    int s1,s2,s3;
    int Perimeter;
    double Area;
    
    public Triangle(int s1, int s2, int s3){
       sides.add(s1);
       sides.add(s2);
       sides.add(s2);
    }
    
    public void getside(){
        this.sides = sides;
    }
    
    public void isEquilateral(){
        if(s1 == s2 && s1 == s3 && s2 == s3){
            System.out.println("It is Equilateral");
        }
    }
    
    public void calculatePerimeter(int s1, int s2, int s3){
        Perimeter = s1 + s2 + s3;
        System.out.printf("Perimeter is %d",Perimeter);
    }

    public void claculateArea(int s1, int s2, int s3){
        Perimeter = s1 + s2 + s3;
        int s = Perimeter/2;
        double a;
        a = s*(s-s1)*(s-s2)*(s-s3);
        
        Area = Math.sqrt(a);
        System.out.printf("Area is %f",Area);
    }
    
    public String draw(){
        System.out.println("Shape is Triangle");
        System.out.printf("Perimeter is %d:",Perimeter);
        System.out.printf("Area is %f:",Area);
        return null;
    }
    
    public void equals(Circle c,Triangle t,Rectangle r){
        if(t.equals(c) || t.equals(r)){
            System.out.println("They are equals.");
        }
    }
    
    
    public String toString(){
        System.out.println(sides.toString());
        System.out.println(Triangle.class.toString());
        return null;
    }
}

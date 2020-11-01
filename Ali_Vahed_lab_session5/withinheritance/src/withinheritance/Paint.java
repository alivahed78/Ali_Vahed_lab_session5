/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withinheritance;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Paint{
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    
    
    public void addShape(Shape s){
        shapes.add(s);
    }
    public void drawAll(){
        for(int i=0;i<=shapes.size();i++){
            System.out.println(shapes);
            
        }
    }
    
    public void printAll(){
        for(int j=0;j<=shapes.size();j++){
            System.out.println(shapes.get(j));
        }
    }

    

}

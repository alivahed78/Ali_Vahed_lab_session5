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
public class Paint {
    
    ArrayList<Circle> cir = new ArrayList<Circle>();
    ArrayList<Triangle> tri = new ArrayList<Triangle>();
    ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
    
    public void addcircle(Circle c){
        cir.add(c);
    }
    public void addtriangle(Triangle t){
        tri.add(t);
    }
    public void addrectangle(Rectangle r){
        rec.add(r);
    }
    public void drawAll(){
        for(int i=0 ; i<= cir.size() ; i++){
            System.out.println(cir.get(i).draw());
        }
        for(int j=0 ; j<= tri.size() ; j++){
            System.out.println(tri.get(j).draw());
        }
        for(int k=0 ; k<= rec.size() ; k++){
            System.out.println(rec.get(k).draw());
        }
    }
    
    public void PrintAll(){
        for(int i=0 ; i<= cir.size() ; i++){
            System.out.println(cir.get(i).toString());
        }
        for(int j=0 ; j<= tri.size() ; j++){
            System.out.println(tri.get(j).toString());
        }
        for(int k=0 ; k<= rec.size() ; k++){
            System.out.println(rec.get(k).toString());
        }
    }
}


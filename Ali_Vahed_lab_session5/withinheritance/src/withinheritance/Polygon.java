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
public class Polygon extends Shape {
    ArrayList<Integer> sidesofrectangle = new ArrayList<Integer>();
    ArrayList<Integer> sidesoftriangle = new ArrayList<Integer>();
    int sr1,sr2,sr3,sr4;
    int st1,st2,st3;

    public Polygon(int sr1,int sr2,int sr3,int sr4,int st1,int st2,int st3){
        
       sidesofrectangle.add(sr1);
       sidesofrectangle.add(sr2);
       sidesofrectangle.add(sr3);
       sidesofrectangle.add(sr4);
       
       sidesoftriangle.add(st1);
       sidesoftriangle.add(st2);
       sidesoftriangle.add(st3);
    }
    public void getSlides(){
        this.sr1=sr1;
        this.sr2=sr2;
        this.sr3=sr3;
        this.sr4=sr4;
        this.st1=st1;
        this.st2=st2;
        this.st3=st3;
    }
    
}

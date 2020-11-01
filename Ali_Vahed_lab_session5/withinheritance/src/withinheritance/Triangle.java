/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withinheritance;

/**
 *
 * @author user
 */
public class Triangle extends Shape{
    public Triangle(int sr1, int sr2, int sr3, int sr4, int st1, int st2, int st3) {
        super();
    }
    
    public void isEquilateral(){
        if(st1==st2 && st1==st3 && st2==st3){
            System.out.println("It is Equilateral");
        }
    }
    
}

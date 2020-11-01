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
public class Rectangle extends Shape {

    public Rectangle(int sr1, int sr2, int sr3, int sr4, int st1, int st2, int st3) {
        super();
    }
    
    public void isSquare(){
       if(sr1==sr2 && sr1 ==sr3 && sr1==sr4 && sr2==sr3 && sr2==sr4 && sr3==sr4){
           System.out.println("It is Square");
       } 
    }
   
}

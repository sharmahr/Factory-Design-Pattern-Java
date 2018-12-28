/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydemo;

/**
 *
 * @author Hardik Sharma
 */
public class Factory {
    Shape shape;
    Shape getShape(String s){
        s.toLowerCase();
    switch(s){
        case "circle" : shape = new Circle();
        break;
        
        case "rectangle" : shape = new Rectangle();
        break;
        
        case "triangle" : shape = new Triangle();
        break;
    
    
    }
    return shape;
    }
}

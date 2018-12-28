
package factorydemo;
/*
Factory design pattern is used when we have a super class with multiple sub-classes and based on input, 
we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class 
from client program to the factory class.

Factory Design Pattern Advantages

    Factory design pattern provides approach to code for interface rather than implementation.
    Factory pattern removes the instantiation of actual implementation classes from client code. 
    Factory pattern makes our code more robust, less coupled and easy to extend. 
      For example, we can easily change PC class implementation because client program is unaware of this.
    Factory pattern provides abstraction between implementation and client classes through inheritance.

*/


import java.util.Scanner;
/*
 * @author Hardik Sharma
 */
interface Shape{
    void draw();
}

public class FactoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factory factory = new Factory();
        System.out.println("enter \n Cirlce \n Rectangle \n Triangle");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Shape shape = factory.getShape(s);
        shape.draw();
    }
    
}

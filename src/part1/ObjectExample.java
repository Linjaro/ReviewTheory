
package part1;

import TurtleGraphics.*;
import BreezySwing.*;

public class ObjectExample {

    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        
        /*
        multi line comment
        Objects are created from a CLASS 
        p1 is an INSTANCE (Object) of the Pen class
        
       
  
        */
        p1.move(25);
        p1.move(-30,50);
        
        /*
        p1. -> brings up a list of methods that p1 has
        some methods are found directly in Pen
        others are INHERITED from "class of all classes" -> object class
        examples -> toString, hasCode, compareTo
        */
        
        
        SketchPadWindow w = new SketchPadWindow(500,500);
        WigglePen wp = new WigglePen(w);
        RainbowPen rp = new RainbowPen(w);
        
        /*
        It is common to have more than 1 way to make an object
        Can make a pen with a custom window or default window
        */
        
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);
        
        
        /*
        Even thought wp and rp are different TYPES of pens
        They respond to the same commands as p1
        Since all 3 pens have the "Pen" class as their Parent
        Pen is where most of these methods are defined and the 3 
        actual pens inherit these methods
        */
        
    }
    
}

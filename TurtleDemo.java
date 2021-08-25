import java.awt.Color;

/*
 * Every Java program contains one or more classes (e.g., TurtleDemo).
 * 
 * In general, every source file (e.g., TurtleDemo.java) contains one class (e.g., TurtleDemo).
 * 
 * The source file must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 */

public class TurtleDemo
{
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */

    public static void main(String[] args)
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
        crush.moveTo(100,100);
        crush.forward(50);
        crush.forward(30);
        crush.forward(30);
        crush.forward(33);
        
        /*
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g., forward).
         * 
         * In general, methods are invoked on objects (e.g., crush).
         * 
         * Wen invoking the method, arguments are passed in parentheses (e.g., 50, 30, 33).
         */
        crush.forward(50);  // this is a comment at the end of a line
        
        // this is a single-line comment (like # in python)
        
        /*
         * Identifiers are any combination of:
         *      letters
         *      digits (but not as the first character)
         *      underscores (_)
         *      dollar signs ($)  // I suggest you don't use
         *      
         *  These are various identifiers:
         */
        
        int y, x2, x_y, x$;
        
    }
}











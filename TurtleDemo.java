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
        
        // this is not a valid identifier
        //int 2y;  
        
        /*
         * Identifiers are case sensitive (case matters).
         * 
         * These are all different identifiers:
         */
        
        Turtle squirt, SQUIRT, sQuIRt;
        
        /*
         * By convention, constants are all uppercase.
         *      Use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 300000000; // m/s
        
        /*
         * By convention, most other identifiers start with a lowercase letter.
         *      Subsequent words start with an uppercase letter. (CamalCase)
         */
        
        World pacificOcean;
        
        /*
         * This is a compile-time error. (This code doesn't even compile!)
         * 
         * This is often a syntax error.
         */
        
        //crush.forwad(50);
        
        /*
         * This is a run-time error. (This code compiles and runs, but generates an exception.  In most
         *      cases the program crashes.)
         */
        
        //crush.forward(1/0);
        
        /*
         * This is also a run-time error. (This code compiles and runs,
         *      but it doesn't produce the expected output.)
         *      
         *  More specifically, this is a logical error as the
         *      turtle turns right instead of left.
         */
        // have the turtle turn left and move forward 50
        crush.turn(90);
        crush.forward(50);
        
    }
    
    
    public static void drawLine()
    {
        /*
         * Objects are entitites in a program.
         *      Objects have attributes.
         *      Objects are minupulated by methods.
         *      
         * ocean and crush are variables that reference objects.
         * 
         * Classes describe a collection of objects.
         *      All objects of a class have the same behavior (methods)
         *      and types of attributes (but they may have different values).
         *      
         * World and Turtle and classes.
         */
        
        World ocean = new World();
        
        /*
         * We use the new operator to construct (create, instantiate) an object.
         * 
         * The class of the object is specified immediately after the new operator (e.g. Turtle).
         * 
         * If we need to pass additional information to construct the object,
         *      arguments are specified in parentheses after the class (e.g. ocean).
         */
        
        Turtle crush = new Turtle(ocean);
    
        /*
         * Variables store values to be used later.
         * 
         *      Variables have a type (e.g., int), a name (e.g., width), and a value (e.g., 20).
         *      
         */
        
        int width;  // declaring a variable
        width = 20;  // assigning a value to a variable
        
        /*
         * Java has several primitive data types:
         *      boolean holds a value true or false
         *      int holds an integer number
         *      double holds a real number (floating point)
         *      char holds a single character
         */
        
        // here is a boolean
        boolean isSummer = true;   // or false
        
        // here is a double
        double salesTaxRate = 0.075;
        //salesTaxRate = 0.075;
        
        // here is a char
        char letter = 'c';
        
        /*
         * When invoking methods, we use the dot operator (i.e., '.')
         *      to invoke a method on an object.
         *      
         * Some methods take no arguments, but we still have parentheses (e.g., penDown() )
         * 
         * Some methods take one or more arguments (e.g., forward(200) )
         * 
         * Mutator methods modify the state (i.e., values of the attributes) of the object.
         *      penDown, forward, setPenColor are all mutator methods.
         */
        crush.penDown();
        crush.forward(25);
        crush.setPenColor(Color.RED);
        crush.forward(30);
        
        Color white = new Color(255,255,255);  // defining own color
        
        
    }
    
    
    
    
    
    
    
}











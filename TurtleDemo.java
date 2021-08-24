import java.awt.Color;

public class TurtleDemo
{
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
    }
}

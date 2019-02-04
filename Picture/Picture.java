import java.awt.*;
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square sky;
    private Square wall;
    private Triangle roof;
    private Square door;
    private Circle window1;
    private Circle window2;
    private Square carBody;
    private Square carTop;
    private Square windShield;
    private Circle wheel1;
    private Circle wheel2;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }
    
    /**
     * Paint this picture.
     */
    public void draw()
    {    
        sky = new Square();
        sky.moveHorizontal(-10);
        sky.moveVertical(-10);
        sky.changeSize(400, 400);
        sky.changeColor("blue");
        
        wall = new Square();
        wall.moveHorizontal(40);
        wall.moveVertical(181);
        wall.changeSize(120, 100);
        wall.changeColor("red");

        roof = new Triangle();
        roof.changeSize(50, 120);
        roof.moveHorizontal(90);
        roof.moveVertical(135);
        roof.changeColor("magenta");
        
        door = new Square();
        door.moveHorizontal(75);
        door.moveVertical(240);
        door.changeSize(60, 30);
        door.changeColor("black");
        
        window1 = new Circle();
        window1.moveHorizontal(44);
        window1.moveVertical(200);
        window1.changeSize(25);
        window1.changeColor("yellow");
        
        window2 = new Circle();
        window2.moveHorizontal(110);
        window2.moveVertical(200);
        window2.changeSize(25);
        window2.changeColor("yellow");
        
        carBody = new Square();
        carBody.moveHorizontal(180);
        carBody.moveVertical(270);
        carBody.changeSize(20, 75);
        carBody.changeColor("red");
        
        carTop = new Square();
        carTop.moveHorizontal(208);
        carTop.moveVertical(250);
        carTop.changeSize(30, 30);
        carTop.changeColor("red");
        
        windShield = new Square();
        windShield.moveHorizontal(222);
        windShield.moveVertical(256);
        windShield.changeSize(10, 10);
        windShield.changeColor("blue");
        
        wheel1 = new Circle();
        wheel1.moveHorizontal(181);
        wheel1.moveVertical(280);
        wheel1.changeSize(30);
        wheel1.changeColor("black");
        
        wheel2 = new Circle();
        wheel2.moveHorizontal(230);
        wheel2.moveVertical(280);
        wheel2.changeSize(30);
        wheel2.changeColor("black");
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(-20);
        sun.moveVertical(0);
        sun.changeSize(100);
    }

}

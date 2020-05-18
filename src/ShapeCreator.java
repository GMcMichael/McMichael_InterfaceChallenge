import processing.core.PApplet;
import java.util.ArrayList;

public class ShapeCreator extends PApplet {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void settings() {
        size(500,500);
    }

    public void setup() {
        shapes.add(new Rectangle(new Point(50, 50), 400, 200));
        shapes.add(new Rectangle(new Point(62, 62), 375, 175));
        //^monitor
        shapes.add(new Rectangle(new Point(50, 250), 400, 150));
        //^base
        shapes.add(new Rectangle(new Point(225, 350), 50, 35));
        //^touchpad
        shapes.add(new Rectangle(new Point(70, 270), 360, 70));
        //^keyboard
    }

    public void draw() {
        for (Shape s: shapes) {
            s.draw(this);
        }
    }

}
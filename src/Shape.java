import java.util.ArrayList;
import processing.core.PApplet;

abstract class Shape implements Compare {

    private Point position;
    private static int numShapes;
    private int id;
    PApplet p;

    abstract public void draw(PApplet p);

    public Shape(Point position){
        this.position=position;
        ++numShapes;
        setId(numShapes);
    }

    public Point getPosition() {
        return position;
    }
    public void setPosition(Point position) {
        this.position = position;
    }
    public static int getNumShapes(){
        return numShapes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    abstract public double computeArea();
    abstract public double getPerimeter();

    public static ArrayList<Shape> sortList(ArrayList<Shape> shapes){
        ArrayList<Shape> sortedShapes = new ArrayList<Shape>();
        //sortedShapes.add(shapes.get(0));
        for (int i = 0; i < shapes.size(); i++) {
            if(sortedShapes.size() == 0) sortedShapes.add(shapes.get(i));
            for (int j = 0; j < sortedShapes.size(); j ++) {
                if (Compare.compareArea(sortedShapes.get(j), shapes.get(i))){
                    sortedShapes.add(j, shapes.get(i));
                    break;
                }
            }
        }
        return sortedShapes;
    }

    public String toString(){
        return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f", getClass().getName(),id, computeArea(),getPerimeter());
    }
}
import java.util.ArrayList;
import processing.core.PApplet;

class Main {

    private final static String[] OPTIONS= new String[] {"--present","ShapeCreator"};

    public static void main(String[] args) {

        //sortingTest();

        PApplet.main(OPTIONS);
    }

    private static void sortingTest(){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        add(shapes);
        display(shapes);
        System.out.println(String.format("The total number of shapes created are: %d", Shape.getNumShapes()));

        shapes = Shape.sortList(shapes);
        display(shapes);
        System.out.println(String.format("The total number of shapes sorted are: %d", shapes.size()));
    }

    private static void add(ArrayList<Shape> shapes) {
        shapes.add(new Circle(new Point(300.0, 300.0), 100.0));
        shapes.add(new Circle(new Point(200.0, 200.0), 50.0));
        shapes.add(new Circle(new Point(400.0, 50.0), 25.0));
        shapes.add(new Rectangle(new Point(50.0, 50.0), 10.0, 40.0));
        shapes.add(new Rectangle(new Point(0.0, 0.0), 20.0, 20.0));
        shapes.add(new Rectangle(new Point(100.0, 0.0), 40.0, 5.0));
        shapes.add(new Rectangle(new Point(0.0, 100.0), 60.0, 15.0));
    }

    private static void display(ArrayList<Shape> shapes) {
        for(Shape shape: shapes){
            System.out.println(shape);
        }
    }

}
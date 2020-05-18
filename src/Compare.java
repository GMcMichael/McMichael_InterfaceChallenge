public interface Compare {

    static boolean compareArea(Shape shape1, Shape shape2){
        if (shape1.computeArea() == shape2.computeArea()) return comparePerimeter(shape1, shape2);
        if (shape1.computeArea() > shape2.computeArea()) return true;
        else return false;
    }

    static boolean comparePerimeter(Shape shape1, Shape shape2){
        if (shape1.getPerimeter() > shape2.getPerimeter()) return true;
        else return false;
    }

}

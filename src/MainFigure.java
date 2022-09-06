public class MainFigure {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 21);
        Square square = new Square("Square", 112);
        Tringle tringle = new Tringle("Triangle", 4, 6, 8);
        Rectngle rectngle = new Rectngle("Rectangle", 15, 10);

        System.out.println(circle.getName()) + "Parameter:"
                + circle.calculate();
        System.out.println(square.getName()) + "Parameter:"
                + square.calculate();
        System.out.println(tringle.getName()) + "Parameter:"
                + square.calculate();
        System.out.println(rectngle.getName()) + "Parameter:"
        + rectngle.calculate();
    }
}

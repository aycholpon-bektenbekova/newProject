import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Drowable;

public class MainFigure {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 21);
        Square square = new Square("Square", 112);
        Tringle tringle = new Tringle("Triangle", 4, 6, 8);
        Rectngle rectngle = new Rectngle("Rectangle", 15, 10);

        Figure[] figures = {circle,square,tringle,rectngle};

        for (int i = 0; i < figures.length; i ++){
            System.out.println(figures[i].getName()+ " " +
                    "Parameter:" + figures[i].calculate());
        }
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Meow");

        Drowable[] drawables =
                {circle, square, tringle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            //является ли
            if (drawables[i] instanceof Figure){
                System.out.println(
                        ((Figure) drawables[i]).getName() +
                                " Parameter: " +
                                ((Figure) drawables[i])
                                        .calculate());
            }
            if (drawables[i] instanceof Animal){
                //приведение типов type casting
                System.out.println(
                        ((Animal) drawables[i]).getName());
            }
            drawables[i].draw();
        }


       //System.out.println(circle.getName() + " " + "Parameter:" + circle.calculate());
        //System.out.println(square.getName() + " " + "Parameter:" + square.calculate());
        //System.out.println(tringle.getName() + " " + "Parameter:" + tringle.calculate());
        //System.out.println(rectngle.getName() + " " + "Parameter:" + rectngle.calculate());
    }
}

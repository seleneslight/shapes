
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Pole okręgu wynosi: " + circle.shapeArea()
                + "        A jego obwód wynosi:" + circle.shapeCircumference());

        Square square = new Square(5);
        System.out.println("Pole kwadratu wynosi: " + square.shapeArea()
                + "        A jego obwód wynosi:" + square.shapeCircumference());

        Triangle triangle = new Triangle(4, 3, 5);
        System.out.println("Pole trójkąta wynosi: " + triangle.shapeArea()
                + "        A jego obwód wynosi:" + triangle.shapeCircumference());
    }
}
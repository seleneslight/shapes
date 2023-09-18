import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Jaką figurę chcesz stworzyć?");
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Okrąg");
            System.out.println("2. Kwadrat");
            System.out.println("3. Trójkąt");
            try {
                int respondA = scanner.nextInt();
                switch (respondA) {
                    case 1:
                        System.out.println("Podaj promień tego okręgu.");
                        double r = scanner.nextDouble();
                        Circle circle = new Circle(r);
                        System.out.println("Pole okręgu wynosi: " + circle.shapeArea()
                                + "        A jego obwód wynosi:" + circle.shapeCircumference());
                        break;
                    case 2:
                        System.out.println("Podaj długość boku tego kwadratu.");
                        double s = scanner.nextDouble();
                        Square square = new Square(s);
                        System.out.println("Pole kwadratu wynosi: " + square.shapeArea()
                                + "        A jego obwód wynosi:" + square.shapeCircumference());
                        break;
                    case 3:
                        System.out.println("Podaj długości boków tego trójkąta.");
                        System.out.println("A:");
                        double a = scanner.nextDouble();
                        System.out.println("B:");
                        double b = scanner.nextDouble();
                        System.out.println("C:");
                        double c = scanner.nextDouble();
                        Triangle triangle = new Triangle(a, b, c);
                        System.out.println("Pole trójkąta wynosi: " + triangle.shapeArea()
                                + "        A jego obwód wynosi:" + triangle.shapeCircumference());
                        break;
                    default:
                        System.out.println("Podaj wartość 1-3");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Podaj wartość numeryczną");
                continue;
            }
            System.out.println("Czy chcesz kontynułować? 1 - Tak, 2 - Nie");
            int respondB = scanner.nextInt();
            if (respondB == 2) run = false;
        }

    }
}
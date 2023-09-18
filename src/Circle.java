public class Circle implements IHasArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double shapeArea() {
        double r2 = Math.pow(radius, 2);
        return Math.PI * r2;
    }

    @Override
    public double shapeCircumference() {
        return 2 * Math.PI * radius;
    }

}

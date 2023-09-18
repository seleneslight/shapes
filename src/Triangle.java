public class Triangle implements IHasArea {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    @Override
    public double shapeArea() {
        double semiPerimeter = (edgeA + edgeB + edgeC) / 2;
        double toRoot = semiPerimeter * (semiPerimeter - edgeA) * (semiPerimeter - edgeB) * (semiPerimeter - edgeC);
        return Math.sqrt(toRoot);
    }

    @Override
    public double shapeCircumference() {
        return edgeA + edgeB + edgeC;
    }
}

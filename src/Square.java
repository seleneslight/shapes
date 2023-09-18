public class Square implements IHasArea {
    private double edgeLength;

    public Square(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public double shapeArea() {
        return Math.pow(edgeLength, 2);
    }

    @Override
    public double shapeCircumference() {
        return 4 * edgeLength;
    }

}

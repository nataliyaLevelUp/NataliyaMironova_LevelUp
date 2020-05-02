package homework2;

// класс тел вращения
abstract class CircleFigure implements Figure {

    protected double radius;
    public CircleFigure(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

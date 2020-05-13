package homework2;

class Konus extends CircleFigure {

    private double height;
    public Konus(double height, double radius) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI*radius*radius*height / 3;

    }

}

package homework2;

class Prism extends Polyhedron {

    public Prism(double height, double s) {
        super(height, s);
    }

    @Override
    public double getVolume() {
        return s * height;
    }

}

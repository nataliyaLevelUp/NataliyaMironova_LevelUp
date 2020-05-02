package homework2;

class Pyramid extends Polyhedron {

    public Pyramid(double height, double s) {
        super(height, s);
    }

    @Override
    public double getVolume () {
        return height * s * 4 / 3;
    }
}



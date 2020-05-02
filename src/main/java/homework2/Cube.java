package homework2;

class Cube extends Polyhedron {

    public Cube(double s) {
        super(s);
    }

    @Override
    public double getVolume() {
        return s*s*s;
    }

}

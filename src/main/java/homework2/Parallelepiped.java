package homework2;

class Parallelepiped extends Polyhedron {

    public Parallelepiped(double height, double s) {
        super(height, s);
    }

    @Override
    public double getVolume () {
        return height * s;
    }
}

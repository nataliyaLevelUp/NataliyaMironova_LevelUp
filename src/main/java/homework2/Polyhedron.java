package homework2;

// класс многогранников
abstract  class Polyhedron implements Figure {

    protected double height;
    protected double s; // площадь основания
    public Polyhedron(double height, double s) {
        this.height = height;
        this.s = s;
    }

    public Polyhedron(double s) {
        this.s =s;
    }

    public double getHeight() {
        return height;
    }

    public double getS() {
        return s;
    }

}

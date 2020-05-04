package homework2;


public interface Figure extends Comparable<Figure> {
    double getVolume();

    @Override
    default int compareTo(Figure other) {
        return Double.compare(getVolume(), other.getVolume());
    }
}


package study.nomoreFt.fuel;

public class Sonata extends Car {
    private int tripDistance;
    public Sonata(int tripDistance) {
        super();
        this.tripDistance = tripDistance;
    }
    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return "Sonata";
    }
}

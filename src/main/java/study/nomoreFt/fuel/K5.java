package study.nomoreFt.fuel;

public class K5 extends Car {
    private int tripDistance;
    public K5(int tripDistance) {
        super();
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return 13;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return "K5";
    }
}

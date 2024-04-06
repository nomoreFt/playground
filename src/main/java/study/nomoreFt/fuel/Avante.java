package study.nomoreFt.fuel;

public class Avante extends Car {

    private int tripDistance;
    public Avante(int tripDistance) {
        super();
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return "Avante";
    }
}

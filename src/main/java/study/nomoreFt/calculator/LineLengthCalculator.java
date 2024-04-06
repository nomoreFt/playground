package study.nomoreFt.calculator;

public class LineLengthCalculator implements Calculator, PrintCalculateResult{
    private Coordinate coordinate1;
    private Coordinate coordinate2;
    public LineLengthCalculator(Coordinate coordinate1, Coordinate coordinate2) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }

    @Override
    public Double calculate() {
        return Math.sqrt(Math.pow(coordinate1.x - coordinate2.x, 2) + Math.pow(coordinate1.y - coordinate2.y, 2));
    }

    @Override
    public String printResult() {
        return "두 점 사이의 거리는 " + String.format("%.6f", calculate());
    }
}

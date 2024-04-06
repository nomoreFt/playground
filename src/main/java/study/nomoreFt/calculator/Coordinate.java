package study.nomoreFt.calculator;

public class Coordinate implements Comparable<Coordinate>{
    int x;
    int y;

    public Coordinate(int x, int y) {
        assert x <= 24 && y <= 24;

        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate o) {
        if (this.x == o.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}

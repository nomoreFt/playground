package study.nomoreFt.calculator;

public class Coordinate implements Comparable<Coordinate>{
    int x;
    int y;

    public Coordinate(int x, int y) {
        if(x > 24 || y > 24) {
            throw new IllegalArgumentException("좌표는 24이하의 수만 가능합니다.");
        }
        this.x = x;
        this.y = y;
    }

    public boolean match(int x, int y) {
        return this.x == x && this.y == y;
    }

    public boolean matchX(Coordinate x) {
        return this.x == x.x;
    }

    public boolean matchY(Coordinate y) {
        return this.y == y.y;
    }

    @Override
    public int compareTo(Coordinate o) {
        if (this.x == o.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }

    public double distance(Coordinate other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}

package study.nomoreFt.calculator.adapter;

import study.nomoreFt.calculator.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class CoordinateParser {
    private static final String COORDINATE_DELIMITER = "-";
    private static final String COORDINATE_PAIR_DELIMITER = ",";

    //(10,10)-(14,15)-(20,10)
    public static List<Coordinate> parse(String inputCoordinates) {
        List<Coordinate> coordinates = new ArrayList<>();

        String[] pairs = inputCoordinates.split(COORDINATE_DELIMITER);

        for (String pair : pairs) {
            String[] parts = pair.replaceAll("[()]", "").split(COORDINATE_PAIR_DELIMITER);
            int x = Integer.parseInt(parts[0].trim());
            int y = Integer.parseInt(parts[1].trim());

            coordinates.add(new Coordinate(x, y));
        }

        return coordinates;
    }
}

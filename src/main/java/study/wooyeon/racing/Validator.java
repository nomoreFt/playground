package study.wooyeon.racing;

import study.wooyeon.racing.message.Exception;

public class Validator {

    private static final Integer MaxNameLength = 5;

    public static void checkLength(Integer carNameLength) {
        if (carNameLength > MaxNameLength) {
            throw new IllegalArgumentException(Exception.길이제한.getMessage());
        }
    }
}

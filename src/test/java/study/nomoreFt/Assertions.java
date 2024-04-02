package study.nomoreFt;

import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

    public class Assertions {
        private static final Duration SIMPLE_TEST_TIMEOUT = Duration.ofSeconds(1L);

        private Assertions() {
        }

        public static void assertSimpleTest(Executable executable) {
            org.junit.jupiter.api.Assertions.assertTimeoutPreemptively(SIMPLE_TEST_TIMEOUT, executable);
        }
    }


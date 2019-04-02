import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ClockTest {

    private Clock clock = new Clock();

    @Test
    @DisplayName("Check If Ticking Time Exceeded")
    void ticking() {
        assertTimeout(ofMillis(100), ()->clock.ticking());
    }

    @Test
    @DisplayName("Check If Alarming Time Exceeded")
    void alarming() {
        assertTimeout(ofMillis(100), ()->clock.alarming());
    }

    @Test
    @DisplayName("Check If Broken Time Exceeded")
    void broken() {
        assertTimeout(ofMillis(100), ()->clock.broken());
    }
}


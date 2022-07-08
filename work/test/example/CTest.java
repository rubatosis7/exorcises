package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CTest {

    @Test
    void result() {
        C sample = new C(42);
        assertEquals(42, sample.result());
    }

    @Test
    void numberOfAs() {
        C sample = new C();
        int r = sample.numberOfAs("Apples are apples");
        assertEquals(3, r);
    }
}
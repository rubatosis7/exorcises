package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CTest {

    @Test
    void result() {
        C sample = new C(42);
        assertEquals(42, sample.result());
    }
}
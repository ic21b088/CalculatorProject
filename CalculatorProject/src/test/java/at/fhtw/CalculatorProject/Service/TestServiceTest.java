package at.fhtw.CalculatorProject.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {
    private final TestService service = new TestService();

    @Test
    void getSquare() {
        assertEquals(100,service.getSquare(10));
        assertEquals(25, service.getSquare(5));
    }
}
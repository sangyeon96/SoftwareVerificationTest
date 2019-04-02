import org.junit.jupiter.api.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Calculator Addition")
    void add() {
        int a = 7;
        int b = 3;
        int expected = a + b;
        Assertions.assertEquals(expected, calculator.add(a, b));
    }

    @Test
    @DisplayName("Calculator Subtraction")
    void sub() {
        int a = 10;
        int b = 3;
        int expected = a - b;
        Assertions.assertEquals(expected, calculator.sub(a, b));
    }

    @Test
    @DisplayName("Calculator Multiplication")
    void mul() {
        int a = 7;
        int b = 3;
        int expected = a * b;
        Assertions.assertEquals(expected, calculator.mul(a, b));
    }

    @Test
    @DisplayName("Calculator Division")
    void div() {
        int a = 7;
        int b = 3;
        int expected = a / b;
        Assertions.assertEquals(expected, calculator.div(a, b));
    }
}

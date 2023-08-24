import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaFibonacciTest {
    @Test
    void makeFibonacci_whenNumberIs0_return0(){
      int n = 0;
      int actual = JavaFibonacci.makeFibonacci(n);
      int expected = 0;
      assertEquals(expected, actual);
    }

    @Test
    void makeFibonacci_whenNumberIs1_return1(){
        int n = 1;
        int actual = JavaFibonacci.makeFibonacci(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void makeFibonacci_whenNumberIs2_return1(){
        int n = 2;
        int actual = JavaFibonacci.makeFibonacci(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void makeFibonacci_whenNumberIs8_return21(){
        int n = 8;
        int actual = JavaFibonacci.makeFibonacci(n);
        int expected = 21;
        assertEquals(expected, actual);
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

public class BhaskaraTest {
    
    @Test
    public void testDeltaNegativo() {
        // Delta < 0: sem raízes reais
        double[] resultado = Bhaskara.calcularRaizes(1, 2, 5);
        assertEquals(0, resultado.length);
    }
    
    @Test
    public void testDeltaZero() {
        // Delta = 0: uma raiz real
        double[] resultado = Bhaskara.calcularRaizes(1, -2, 1);
        assertEquals(1, resultado.length);
        assertEquals(1.0, resultado[0], 0.001);
    }
    
    @Test
    public void testDeltaPositivo() {
        // Delta > 0: duas raízes reais
        double[] resultado = Bhaskara.calcularRaizes(1, -5, 6);
        assertEquals(2, resultado.length);
        assertEquals(3.0, resultado[0], 0.001);
        assertEquals(2.0, resultado[1], 0.001);
    }
    
    @Test
    public void testCoeficientesNegativos() {
        // Teste com coeficientes negativos
        double[] resultado = Bhaskara.calcularRaizes(-1, 4, -3);
        assertEquals(2, resultado.length);
        assertEquals(1.0, resultado[0], 0.001);
        assertEquals(3.0, resultado[1], 0.001);
    }
    
    @Test
    public void testRaizesComDecimais() {
        // Teste com resultado decimal
        double[] resultado = Bhaskara.calcularRaizes(2, -7, 3);
        assertEquals(2, resultado.length);
        assertEquals(3.0, resultado[0], 0.001);
        assertEquals(0.5, resultado[1], 0.001);
    }
}
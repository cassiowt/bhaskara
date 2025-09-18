import org.junit.Test;
import static org.junit.Assert.*;

public class BhaskaraTest {
    
    /**
     * Testa o cálculo das raízes quando o discriminante (delta) é negativo.
     * 
     * Este teste verifica que quando a equação quadrática não possui raízes reais
     * (delta < 0), o método retorna um array vazio. Usa os coeficientes
     * a=1, b=2, c=5 que resulta em delta = 4 - 20 = -16.
     * 
     * Comportamento esperado: Retorna um array com comprimento 0 já que não há
     * soluções reais para a equação quadrática.
     */
    @Test
    public void testDeltaNegativo() {
        // Delta < 0: sem raízes reais
        double[] resultado = Bhaskara.calcularRaizes(1, 2, 5);
        assertEquals(0, resultado.length);
    }
    
    /**
     * Testa o cálculo da fórmula de Bhaskara quando o discriminante (delta) é igual a zero.
     * Quando delta = 0, a equação quadrática tem exatamente uma raiz real (raiz repetida).
     * 
     * Este teste usa a equação x² - 2x + 1 = 0, que tem delta = (-2)² - 4(1)(1) = 0,
     * resultando em uma única raiz x = 1.
     * 
     * Verifica que:
     * - O array resultado contém exatamente um elemento
     * - O valor da única raiz é 1.0 (dentro da tolerância de 0.001)
     */
    @Test
    public void testDeltaZero() {
        // Delta = 0: uma raiz real
        double[] resultado = Bhaskara.calcularRaizes(1, -2, 1);
        assertEquals(1, resultado.length);
        assertEquals(1.0, resultado[0], 0.001);
    }
    
    /**
     * Testa o cálculo das raízes quando o discriminante (delta) é positivo.
     * Quando delta > 0, a equação quadrática possui duas raízes reais distintas.
     * Este teste verifica se a classe Bhaskara calcula corretamente ambas as raízes
     * para a equação x² - 5x + 6 = 0, que deve resultar nas raízes 3.0 e 2.0.
     */
    @Test
    public void testDeltaPositivo() {
        // Delta > 0: duas raízes reais
        double[] resultado = Bhaskara.calcularRaizes(1, -5, 6);
        assertEquals(2, resultado.length);
        assertEquals(3.0, resultado[0], 0.001);
        assertEquals(2.0, resultado[1], 0.001);
    }
    
    /**
     * Testa o cálculo das raízes da equação quadrática com coeficientes negativos.
     * 
     * Este teste verifica se o método calcularRaizes consegue lidar corretamente
     * com uma equação onde o coeficiente 'a' é negativo (-x² + 4x - 3 = 0).
     * 
     * A equação testada: -x² + 4x - 3 = 0
     * Raízes esperadas: x₁ = 1.0 e x₂ = 3.0
     * 
     * Verifica:
     * - Se o método retorna exatamente 2 raízes
     * - Se as raízes calculadas são 1.0 e 3.0 (com tolerância de 0.001,
     *   ou seja, aceita pequenas diferenças devido a imprecisões de ponto flutuante)
     */
    @Test
    public void testCoeficientesNegativos() {
        // Teste com coeficientes negativos
        double[] resultado = Bhaskara.calcularRaizes(-1, 4, -3);
        assertEquals(2, resultado.length);
        assertEquals(1.0, resultado[0], 0.001);
        assertEquals(3.0, resultado[1], 0.001);
    }
    
    /**
     * Testa o cálculo das raízes da equação quadrática quando os resultados são números decimais.
     * 
     * Este teste verifica se o método Bhaskara.calcularRaizes calcula corretamente
     * as raízes da equação quadrática 2x² - 7x + 3 = 0, que deve resultar
     * em duas raízes decimais: 3.0 e 0.5.
     * 
     * O teste valida:
     * - O método retorna exatamente 2 raízes
     * - A primeira raiz é aproximadamente 3.0 (com tolerância de 0.001)
     * - A segunda raiz é aproximadamente 0.5 (com tolerância de 0.001)
     */
    @Test
    public void testRaizesComDecimais() {
        double[] resultado = Bhaskara.calcularRaizes(2, -7, 3);
        assertEquals(2, resultado.length);
        assertEquals(3.0, resultado[0], 0.001);
        assertEquals(0.5, resultado[1], 0.001);
    }
}
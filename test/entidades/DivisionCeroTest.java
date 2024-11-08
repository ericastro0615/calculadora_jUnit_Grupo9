package entidades;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionCeroTest {
    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
        System.out.println("Iniciando test de div/ cero");
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionDenominadorCero() {
        System.out.println("Test de division con denominador cero");
        int numerador = 4;
        int denominador = 0;
        System.out.println("se espera en el test ArithmeticException proque se dividio por cero");
        int resultado = calculadora.division(numerador, denominador);

    }


    @After
    public void tearDown() {
        System.out.println("--Test de division finalizado\n");
    }
}
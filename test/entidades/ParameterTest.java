package entidades;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParameterTest {
    private double numero1;
    private double numero2;
    private double resultadoEsperado;
    private Calculadora calc = new Calculadora();

    public ParameterTest(double numero1, double numero2, double esperado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultadoEsperado = esperado;

    }

    @BeforeClass
    public static void informeDeOperaciones() {
        System.out.println("----- SE PASARON POR PARAMETROS esperando resolucion de " +
                "\n  8.0+ 7.1= 15.1 \n" +
                "                 2.0+ 0.0= 2.0\n" +
                "                10.0+ -1.0= 9.0");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
                {8.0, 7.1, 15.1},
                {2.0, 0.0, 2.0},
                {10.0, -1.0, 9.0}
        });
    }

    @Test
    public void testSumaParametrizada() {

        assertEquals(resultadoEsperado, ( calc.suma(numero1,numero2) ) , 0.001);
        System.out.println("\n SUMA parametrizada resultado: " + resultadoEsperado);
    }


}

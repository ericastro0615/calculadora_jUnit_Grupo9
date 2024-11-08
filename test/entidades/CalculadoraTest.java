package entidades;

import org.junit.*;

import static org.junit.Assert.*;



/*
@Before antes de cada mtodo
    que muestre un mensaje de la operación que se testea
     Use System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
     6. @After para que luego de cada mtodo testeado que diga "Prueba finalizada,
     campos en 0”.
 */


public class CalculadoraTest {

    Calculadora cal1= new Calculadora();
    int numero1 = 10;
    int numero2=2;
    double numDob1= 12.2;
    double numDob2 = 3.5;


    @Before
    public void setUp()  {
        System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName());

    }//se muestra 1 setup por consola - ARREGLAR --------------------------------


    @After
    public void tearDown() throws Exception {
        System.out.println("prueba finalizada en campos 0");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("la prueba finalizo");
    }

    @Test
    public void suma() {
        double resultadoInt = cal1.suma(numDob1, numDob2);
        assertEquals(15.7, resultadoInt, 0.001);
        System.out.println("\n SUMA resultado: " + resultadoInt);
    }

    @Test
    public void resta() {
        double resultado1 = cal1.resta(numDob1, numDob2);
        assertEquals(8.7, resultado1, 0.001);
        System.out.println("\n RESTA resultado: " + resultado1);
    }

    @Test
    public void division() {
        int resultadoInt = cal1.division(numero1, numero2);
        assertEquals(5, resultadoInt);
        System.out.println("\n DIVISION resultado: " +resultadoInt);
    }

    @Test
    public void multiplicacion() {
        int resint = cal1.multiplicacion(numero1, numero2);
        assertEquals(20, resint);
        System.out.println("\n MULTIPLCACION resultado: " + resint);
    }






}
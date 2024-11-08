package entidades;

public class Calculadora {
    // Realizar la clase java calculador que permite por el momento, realizar las cuatro operaciones matemáticas básicas.
// Use solo para Suma y Resta de números con coma.

        public double suma (double num1, double num2) {
            return num1 + num2;
        }

        public double resta (double num1, double num2) {
            return num1- num2;
        }

        public int division (int num1, int num2) {
            /*if (num2==0) {
                System.out.println(" ⛔ Denominador no puede ser igual a 0");
            } */
            return num1/num2;
        }

        public int multiplicacion(int num1, int num2) {
            return num1 * num2;
        }

}

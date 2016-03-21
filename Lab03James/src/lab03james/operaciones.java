package lab03james;
public class operaciones {
    public void suma(int a, int b) {
        int res = a + b;
        System.out.println("El Resultado de la Suma es : " + res);
    }
    public void resta(int a, int b) {
        int res = a - b;
        System.out.println("El Resultado de la Resta es : " + res);
    }
    public void multiplicacion(int a, int b) {
        int res = a * b;
        System.out.println("El Resultado de la Multiplicación es : " + res);
    }
    public void division(int a, int b) {
        double res = a / b;
        System.out.println("El Resultado de la División es : " + res);
    }
    public void potencia(int a, int b) {
        double res = Math.pow(a, b);
        System.out.println("El Resultado de la Potencia es : " + res);
    }
}

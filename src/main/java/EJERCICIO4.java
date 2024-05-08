public class EJERCICIO4 {
    public static void main(String[] args) {
        int number = 254;
        int sum = sumOfDigits(number);
        System.out.println(sum);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}

/* El tipo de recursividad empleado en este codigo es lineal donde cada llamada recursiva se hace de manera secuencial
es decir que una llamada recursiva no comienza hasta que se completa la anterior*/


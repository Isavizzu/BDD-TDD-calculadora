import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calculadora {

    public int calcularModulo (int n, int num) {
        return n % num;
    }

    @Test
    public void teste_Modulo() {
        int n = 100;
        int num = 10;
        int mult = calcularModulo(n, num);
        assertEquals(0, mult);
    }

    public int calcularMultiplicacao(int n, int num) {
        return n * num;
    }

    @Test
    public void teste_Multiplicar() {
        int n = 10;
        int num = 100;
        int mult = calcularMultiplicacao(n, num);
        assertEquals(1000, mult);
    }


    public int calcularPotencia(int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }

    @Test
    public void teste_Potencia() {
        int n = 10;
        int num = 2;
        int ele = calcularPotencia(n, num);
        assertEquals(100, ele);
    }



// public static double calcularRaiz(int num_1) {
//     return Math.sqrt(num_1);
// }

// public static double calcularDivisao(int a, int b) {
//     return (double) a / b;
// }

// public static int calcularSoma(int n, int num) {
//     return n + num;
// }

// public static int calcularSubtracao(int n, int num)
//    return n - num;
//}

}

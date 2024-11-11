import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

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


    public double calcularRaiz(int num_1) {
         return Math.sqrt(num_1);
    }

    @Test
    public void teste_Raiz(){
        int num = 25;
        double raiz = calcularRaiz(num);
        assertEquals(5.0, raiz, 0.001);
    }

    public double calcularDivisao(int a, int b) {
         return  (double) a / b;
    }

    @Test
    public void teste_Divisao(){
        int num1 = 10;
        int num2 = 2;
        double div = calcularDivisao(num1, num2);
        assertEquals(5.0, div, 0.001);

    }

    public double calcularPorcentagem(int base, int percentual){
        return (double) (base * percentual) / 100;
    }

    @Test
    public void teste_Porcentagem(){
        int base = 100;
        int percentual = 20;
        double porc = calcularPorcentagem(base, percentual);
        assertEquals(20.0, porc, 0.001);

    }


    public static int calcularSoma(int n, int num) {
         return n + num;
     }

     @Test
     public void Teste_Soma (){
        int i = 5;
        int j = 10;
        int soma = calcularSoma(i, j);
        assertEquals(15, soma);
    }

    public static int calcularSubtracao(int n, int num){
        return n - num;
    }

    @Test
     public void Teste_Subtracao (){
        int i = 100;
        int j = 10;
        int sub = calcularSubtracao(i, j);
        assertEquals(90, sub);
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }

    @Test
    public void Teste_Fatorial() {
        int n = 5;
        int resultado = calcularFatorial(n);
        assertEquals(120, resultado);
    }


}
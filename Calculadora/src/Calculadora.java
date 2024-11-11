import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class Calculadora {

    // public int calcularModulo (int n, int num) {
       //  return n % num;
   //  }

   // @Test
   // public void teste_Modulo() {
    //    int n = 100;
   //     int num = 10;
   //     int mult = calcularModulo(n, num);
   //     assertEquals(0, mult);
   // }

   // public int calcularMultiplicacao(int n, int num) {
   //     return n * num;
    //}

   // @Test
   // public void teste_Multiplicar() {
    //    int n = 10;
    //    int num = 100;
     //   int mult = calcularMultiplicacao(n, num);
      //  assertEquals(1000, mult);
   // }


    //public int calcularPotencia(int base, int expoente) {
    //    return (int) Math.pow(base, expoente);
    //}

   // @Test
   // public void teste_Potencia() {
   //     int n = 10;
    //    int num = 2;
    //    int ele = calcularPotencia(n, num);
   //     assertEquals(100, ele);
   // }



// public static double calcularRaiz(int num_1) {
//     return Math.sqrt(num_1);
// }

// public static double calcularDivisao(int a, int b) {
//     return (double) a / b;
// }

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

public static int calcularSubtracao(int n, int num)
    return n - num;
}

@Test
 public void Teste_Subtracao (){
    int i = 100;
    int j = 10;
    int sub = calcularSubtracao(i, j);
    assertEquals(90, sub);
}

public static double calcularExponenciacao(double base, double expoente){
    return Math.pow(base, expoente);
}

@Test
public void teste_Exponenciacao(){
    double base = 2;
    double expoente = 3;
    double res = calcularExponenciacao(base, expoente);
    assertEquals(8.0, res);
}



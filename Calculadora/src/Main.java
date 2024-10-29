
public class Main {
    public static void main(String[] args) {
        int num_1 = 10;
        int num_2 = 20;
   
        System.out.println(calcularSoma(num_1, num_2));
        System.out.println(calcularSubtracao(10, 20));

        System.out.println(calcularMultiplicacao(10,20));
        System.out.println(calcularPotencia(2,2));

        System.out.println(calcularDivisao(num_1, num_2));
        System.out.println(calcularRaiz(num_1));
    }

    public static double calcularRaiz(int num_1){
        return Math.sqrt(num_1);
    }

    public static double calcularDivisao(int a, int b){
        return (double) a / b;
    }

    public static double calcularPotencia(int base, int expoente) {
        return Math.pow(base, expoente);
    }

    public static int calcularMultiplicacao(int n, int num) {
        return n * num;
    }

    public static int calcularSoma(int n, int num){
        return n + num;
    }

    public static int calcularSubtracao(int n, int num){
        return n - num;
    }
}
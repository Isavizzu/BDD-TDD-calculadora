//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num_1 = 10;
        int num_2 = 20;
        //calcularSoma(num_1, num_2);
        // calcularSubtracao(num_1, num_2);
        // System.out.println(calcularSubtracao(10, 20));
    }

    public static int calcularSoma (int n, int num){
        int result = n + num;
        return result;
    }

    // public static int calcularSoma(int n, int num){
        //return n + num;
   // }

   // public static int calcularSubtracao (int n, int num){
       // int result = n - num;
      //  return result;
    //}

    public static int calcularSubtracao(int n, int num){
       return n - num;
    }
}
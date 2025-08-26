package ExerciciosJoaoGabrielSilvaPoo;
import java.util.Scanner;
class exercicio8 {
    public static void main( String []args){
        Scanner entrada = new Scanner(System.in);

     System.out.println("Informe o valor da variável A: ");
     int A = entrada.nextInt();
     System.out.println("Informe o valor da variável B: ");
     int B = entrada.nextInt();

     int auxiliar = A;
     A = B;
     B = auxiliar;


     System.out.println("O novo valor de A é: " + A);
     System.out.println("O novo valor de B é: " + B);

     entrada.close();
    }
}

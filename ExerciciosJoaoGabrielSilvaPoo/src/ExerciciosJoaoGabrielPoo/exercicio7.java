package ExerciciosJoaoGabrielSilvaPoo;

import java.util.Scanner;
public class exercicio7 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro termo da P.A: ");
        double primeiroTermo = entrada.nextDouble();
        System.out.println("Informe a razao da P.A: ");
        double razao = entrada.nextDouble();
        System.out.println("Informe o indice do N-Ésimo termo da P.A: ");
        double IndiceEnesimo = entrada.nextDouble();

        double Enesimo = primeiroTermo + (IndiceEnesimo - 1) * razao;

        System.out.println("Valor da P.A de " + IndiceEnesimo + ": " + Enesimo);

        entrada.close();
    }
}

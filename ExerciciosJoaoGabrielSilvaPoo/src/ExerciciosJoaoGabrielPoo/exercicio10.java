package ExerciciosJoaoGabrielSilvaPoo;

import java.util.Scanner;
class exercicio10 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos resolver a equação: Eq = 2 * sqrt(3x+30)/ 3 + (y-32)^4");
        System.out.println("Informe um valor para X: ");
        int x = entrada.nextInt();
        System.out.println("Informe um valor para Y");
        int y = entrada.nextInt();

        double equacao = 2 * Math.sqrt((3 * x) +30) / 3 + Math.pow((y - 32), 4);

        System.out.println("Resultado da equação para os valores de X e Y sendo, respectivamente: " + x + " e " + y);
        System.out.printf("equação = %.2f", equacao);

        entrada.close();


    }
}

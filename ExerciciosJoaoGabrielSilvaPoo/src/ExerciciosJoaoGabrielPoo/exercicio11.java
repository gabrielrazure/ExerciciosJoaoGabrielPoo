package ExerciciosJoaoGabrielSilvaPoo;

import java.util.Scanner;
class exercicio11 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos calcular a distancia euclidiana entre os pontos A(x1,y1) e B(x2,y2)! ");
        System.out.println("informe um valor para x1: ");
        double x1 = entrada.nextDouble();
        System.out.println("informe um valor para y1: ");
        double y1 = entrada.nextDouble();
        System.out.println("informe um valor para x2: ");
        double x2 = entrada.nextDouble();
        System.out.println("informe um valor para y2: ");
        double y2 = entrada.nextDouble();

        double DistanciaEuclidiana = Math.sqrt(Math.pow((y2 - y1), 2 ) + Math.pow((x2 - x1), 2 ));

        System.out.printf("A distancia euclidiana entre os pontos A e B é: %.2f", DistanciaEuclidiana);

    }
}

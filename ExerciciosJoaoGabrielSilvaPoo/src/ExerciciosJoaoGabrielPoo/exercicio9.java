package ExerciciosJoaoGabrielSilvaPoo;

import java.util.Scanner;
class exercicio9 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o raio da esfera: ");
        double raio = entrada.nextDouble();

        double area = Math.PI * Math.pow(raio,2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("Area da esfera: %.2f\n", area);
        System.out.printf("Perimetro da esfera: %.2f", perimetro);

    entrada.close();
    }
}

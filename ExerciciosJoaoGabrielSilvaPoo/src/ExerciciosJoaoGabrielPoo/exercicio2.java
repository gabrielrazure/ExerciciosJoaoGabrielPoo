package ExerciciosJoaoGabrielSilvaPoo;

import java.util.Scanner;
class exercicio2 { public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o dividendo: ");
    double dividendo = entrada.nextDouble();
    System.out.println("Digite o divisor: ");
    double divisor = entrada.nextDouble();

    double quociente = dividendo / divisor;
    double resto = dividendo % divisor;

    System.out.println("Com os valores informados, temos os seguintes resultados: ");
    System.out.println("Dividendo: " + dividendo);
    System.out.println("Divisor: " + divisor);
    System.out.printf("Quociente: %.2f \n", quociente);
    System.out.println("Resto: " + resto);

    entrada.close();

}
}

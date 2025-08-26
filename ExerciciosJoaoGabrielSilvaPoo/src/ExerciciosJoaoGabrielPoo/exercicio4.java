package ExerciciosJoaoGabrielSilvaPoo;
import java.util.Scanner;
class exercicio4 { public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("informe uma temperatura em celsius: ");
    double tempCelsius = entrada.nextDouble();

    double tempFahrenheit = tempCelsius * (9.0/5.0) + 32.0;

    System.out.println("Temperatura " + tempCelsius + "°C em fahrenheit: " + tempFahrenheit);

    entrada.close();
}
}

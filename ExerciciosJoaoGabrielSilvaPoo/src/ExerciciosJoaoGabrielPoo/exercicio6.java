package ExerciciosJoaoGabrielSilvaPoo;

import java.util.Scanner;
class exercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tempo, em horas, da viagem: ");
        double tempoViagem = entrada.nextDouble();
        System.out.println("Informe a velocidade média da viagem: ");
        double velocidadeMedia = entrada.nextDouble();

        double autonomia = 12;
        double distancia = tempoViagem * velocidadeMedia;
        double litrosUsados = distancia/autonomia;

        System.out.println("Velocidade media: " +  velocidadeMedia + "Km/H");
        System.out.println("Tempo gasto: " + tempoViagem + " horas");
        System.out.println("Distancia percorrida: " + distancia + "Km");
        System.out.printf("Litros de combustível gastos na viagem: %.2f L", litrosUsados);


        entrada.close();
    }
}

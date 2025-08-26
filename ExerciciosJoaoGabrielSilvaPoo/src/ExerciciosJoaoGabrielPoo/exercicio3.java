package ExerciciosJoaoGabrielSilvaPoo;

import java.util.Scanner;
class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Olá! Qual o seu nome? ");
        String nomeUsuario = entrada.nextLine();
        System.out.println("Que nome bonito! e qual a sua idade? ");
        int idadeUsuario = entrada.nextInt();

        int ano = 365;
        double idadeEmDias = idadeUsuario * ano;

        System.out.println("A sua idade em dias é aproximadamente: " + idadeEmDias + "dias");

        entrada.close();
    }
}
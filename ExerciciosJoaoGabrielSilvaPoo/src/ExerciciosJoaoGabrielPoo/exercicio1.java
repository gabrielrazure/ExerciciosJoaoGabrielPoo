package ExerciciosJoaoGabrielSilvaPoo;

import java.util.Scanner;
class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe o nome e sobrenome do marido: ");
        String marido = entrada.nextLine();
        System.out.println("informe o nome e sobrenome da esposa: ");
        String esposa = entrada.nextLine();
        System.out.println("informe o ano de casamento: ");
        int AnoCasamento = entrada.nextInt();

        int AnoAtual = 2018;
        int AnosCasados = AnoAtual - AnoCasamento;

        System.out.println(marido + "é casado com " + esposa + " há " + AnosCasados + " anos.");

        entrada.close();


    }
}
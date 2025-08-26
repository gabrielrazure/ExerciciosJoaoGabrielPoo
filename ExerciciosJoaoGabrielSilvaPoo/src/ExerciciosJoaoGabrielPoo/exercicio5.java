package ExerciciosJoaoGabrielSilvaPoo;
import java.util.Scanner;
class exercicio5 { public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);


    System.out.println("Informe o valor do produto: ");
    double valorProduto = entrada.nextDouble();
    System.out.println("Informe o valor do desconto: ");
    double valorDesconto = entrada.nextDouble();

    double novoValor = valorProduto - (valorProduto * (valorDesconto/100));

    System.out.printf("O GERENTE FICOU MALUCO!! O novo valor do produto é: R$%.2f",  novoValor );

    entrada.close();

}
}

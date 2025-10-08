import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int total = 0, aprovados = 0, reprovados = 0, exame = 0;
        double somaMedias = 0, maiorMedia = -1, menorMedia = 11;
        String nomeMaior = "", nomeMenor = "";
        char continuar;

        do {
            System.out.print("Nome do aluno: ");
            String nome = entrada.next();

            System.out.print("Nota 1: ");
            double n1 = entrada.nextDouble();

            System.out.print("Nota 2: ");
            double n2 = entrada.nextDouble();

            double media = (n1 + n2) / 2;
            somaMedias += media;
            total++;

            System.out.printf("%s obteve média: %.1f\n", nome, media);

            if (media < 4) {
                System.out.println("Situação: Reprovado");
                reprovados++;
            } else if (media < 6) {
                System.out.println("Situação: Exame");
                exame++;
            } else {
                System.out.println("Situação: Aprovado");
                aprovados++;
            }

            if (media > maiorMedia) {
                maiorMedia = media;
                nomeMaior = nome;
            }

            if (media < menorMedia) {
                menorMedia = media;
                nomeMenor = nome;
            }

            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
            continuar = entrada.next().toUpperCase().charAt(0);
            System.out.println();

        } while (continuar == 'S');

        double mediaGeral = somaMedias / total;

        System.out.println("Resumo final:");
        System.out.println("Total de alunos: " + total);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Em exame: " + exame);
        System.out.printf("Média da turma: %.2f\n", mediaGeral);
        System.out.println("Maior média: " + nomeMaior + " - " + maiorMedia);
        System.out.println("Menor média: " + nomeMenor + " - " + menorMedia);

        entrada.close();
    }
}
import java.util.Scanner;

public class DistanciaPontoReta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe x0: ");
        double x0 = entrada.nextDouble();

        System.out.print("Informe y0: ");
        double y0 = entrada.nextDouble();

        System.out.print("Informe a: ");
        double a = entrada.nextDouble();

        System.out.print("Informe b: ");
        double b = entrada.nextDouble();

        System.out.print("Informe c: ");
        double c = entrada.nextDouble();

        double distancia = Math.abs(a * x0 + b * y0 + c) / Math.sqrt(a * a + b * b);

        System.out.printf("A distância entre o ponto e a reta é: %.2f\n", distancia);

        entrada.close();
    }
}
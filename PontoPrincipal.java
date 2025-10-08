import java.util.Scanner;

public class PontoPrincipal {
    public static double distanciaEuclidiana(Ponto a, Ponto b) {
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Coordenada X do ponto A: ");
        double xa = entrada.nextDouble();
        System.out.print("Coordenada Y do ponto A: ");
        double ya = entrada.nextDouble();

        System.out.print("Coordenada X do ponto B: ");
        double xb = entrada.nextDouble();
        System.out.print("Coordenada Y do ponto B: ");
        double yb = entrada.nextDouble();

        Ponto a = new Ponto(xa, ya);
        Ponto b = new Ponto(xb, yb);

        double distancia = distanciaEuclidiana(a, b);

        System.out.printf("A distância entre os pontos A%s e B%s é: %.2f\n", a, b, distancia);

        entrada.close();
    }
}
import java.util.Scanner;
public class Bee1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio = scanner.nextInt();
        int fim = scanner.nextInt();
        scanner.close();
        if (inicio < fim) {
            System.out.println("O JOGO DUROU " + (fim - inicio) + " HORA(S)");
        }
        else if (inicio == fim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU " + (24 + fim - inicio) + " HORA(S)");
        }
    }
}
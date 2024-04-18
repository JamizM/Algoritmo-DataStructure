import java.util.Date;
import java.util.Scanner;

public class ComparaMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        while (tamanho > 0) {
            MeuVetor v = new MeuVetor(tamanho);

            v.preencheVetor(tamanho * 10);
            System.out.println(v); //vetor desordenado
            long inicio = new Date().getTime();
            v.quicksort(0, tamanho-1);
            long fim = new Date().getTime();
            System.out.println(v); //vetor ordenado
            System.out.println("Quick demorou: " + (fim-inicio) + "ms");

            System.out.println("Escolha o tamanho do vetor: ");
            tamanho = sc.nextInt();
        }
        sc.close();
    }
}

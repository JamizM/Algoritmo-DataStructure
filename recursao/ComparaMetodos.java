import java.util.Scanner;
import java.util.Date;
public class ComparaMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("escolha o tamanho do vetor, 0 encerra: ");
        int tamanho = scanner.nextInt();
        while (tamanho > 0) {
            MeuVetor v = new MeuVetor(tamanho);
            v.preencheVetor(tamanho*10);
            //System.out.println(v);
            long ini = new Date().getTime();
            v.quicksort(0, tamanho-1);
            long fim = new Date().getTime();
            //System.out.println(v);
            System.out.println("1o quick demorou " + (fim-ini) + " ms");
            // v.resetVetor();
            // v.preencheVetor(tamanho * 10);
            // ini = new Date().getTime();
            // v.bubbleSort();
            // fim = new Date().getTime();
            // System.out.println("bubble demorou " + (fim-ini) + " ms");

            ini = new Date().getTime();
            v.quicksort(0, tamanho-1);
            fim = new Date().getTime();
            System.out.println("2o quick demorou " + (fim-ini) + " ms");


            System.out.print("escolha o tamanho do vetor, 0 encerra: ");
            tamanho = scanner.nextInt();
        }
        scanner.close();
    }
}

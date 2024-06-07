import java.util.Scanner;
public class Bee1249 {
    public static void main(String[] args) {
        //variáveis
        Scanner scanner = new Scanner(System.in);
        int[] pares = new int[100000];
        int[] impares = new int[100000];
        int nPares=0, nImpares=0, n;
        //entrada
        n = scanner.nextInt();
        for (int i=0; i<n; i++) {
            int x = scanner.nextInt();
            if (x%2 == 0) {
                pares[nPares++] = x;
            }
            else {
                impares[nImpares++] = x;
            }
        }
        scanner.close();
        //ordenar pares em ordem crescente
        for (int j = 1; j < nPares; ++j) {
            int x = pares[j];
            int i;
            for (i = j-1; i >= 0 && pares[i] > x; --i) 
                pares[i+1] = pares[i];
            pares[i+1] = x;
        }
        //ordenar impares em ordem decrescente
        for (int j = 1; j < nImpares; ++j) {
            int x = impares[j];
            int i;
            for (i = j-1; i >= 0 && impares[i] < x; --i) 
                impares[i+1] = impares[i];
            impares[i+1] = x;
        }
        //saida:
        //primeiro os pares
        for (int i=0; i<nPares; i++) {
            System.out.println(pares[i]);
        }
        //depois os impares
        for (int i=0; i<nImpares; i++) {
            System.out.println(impares[i]);
        }
    }
}

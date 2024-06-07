import java.util.Scanner;

public class OrdenaBusca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("digite o tamanho do vetor, 0 encerra: ");
        int n = sc.nextInt();
        
        while (n>0) {
            MeuVetor v1 = new MeuVetor(n);
            v1.preencheVetor();
            //System.out.println("vetor gerado: " + v1);
            System.out.print ("digite o valor para a busca: ");
            double x = sc.nextDouble();
            Retorno r = v1.buscaSimples(x);
            if (r.getAchou()) 
                System.out.println(x + " encontrado no vetor pela simples");
            else 
                System.out.println(x + " nao encontrado pela busca simples");
            System.out.println("foram realizadas " + r.getContador() + " comparacoes");
            System.out.println("\nordenando...");
            v1.bubbleSort();
            r = v1.buscaBinaria(x);
            if (r.getAchou()) 
                System.out.println(x + " encontrado no vetor pela busca binaria");
            else
                System.out.println(x + " nao encontrado pela busca binaria");
            System.out.println("foram realizadas " + r.getContador() + " comparacoes");
            
            System.out.print ("\ndigite o tamanho do vetor, 0 encerra: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}

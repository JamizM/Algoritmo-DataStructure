import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random r = new Random();
        ABB abb = new ABB();
        int t = r.nextInt(200) + 50;
        System.out.println("t = " + t);
        for (int i=1; i<=t; i++) {
            int n = r.nextInt(t) + 1;
            System.out.print(n + " ");
            abb.insere(n);
        }
        System.out.println("\na arvore:\n" + abb.inOrder());
        System.out.println("numero de nos: " + abb.numeroNos());
        System.out.println("altura da arvore: " + abb.altura());
        System.out.println("numero de folhas: " + abb.numeroFolhas());

        int x = r.nextInt(t);
        if (abb.existe(x))
            System.out.println(x + " encontrado na arvore");
        else 
            System.out.println(x + " nao foi encontrado");

        System.out.println(abb.proximo(110));
    }
}

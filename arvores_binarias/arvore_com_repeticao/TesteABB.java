import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random r = new Random();
        ABB abb = new ABB();
        int t = r.nextInt(200) + 50;
        System.out.println("t = " + t);
        for (int i=1; i<=t; i++) {
            int n = r.nextInt(t/3);
            System.out.print(n + " ");
            abb.insere(n);
        }
        System.out.println("\na arvore:\n" + abb.inOrder());
        System.out.println("numero de nos: " + abb.numeroNos());
        System.out.println("altura da arvore: " + abb.altura());
    }
}

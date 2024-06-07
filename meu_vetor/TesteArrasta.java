public class TesteArrasta {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(10);
        for (int i=10; i<=50; i+=10) {
            v1.adiciona(i);
        }
        System.out.println(v1);

        v1.adiciona(-1, 3);
        System.out.println(v1);

        v1.adiciona(-2, 27);
        System.out.println(v1);
    }
}

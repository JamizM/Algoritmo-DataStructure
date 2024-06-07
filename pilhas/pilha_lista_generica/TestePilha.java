public class TestePilha {
    public static void main(String[] args) {
        Pilha<Carta> p = new Pilha<>();
        System.out.println(p);
        System.out.println("-------------------\n");
        p.push(new Carta(2, "ouros"));
        System.out.println(p);
        System.out.println("-------------------\n");
        p.push(new Carta(3, "paus"));
        System.out.println(p);
        System.out.println("-------------------\n");
        p.push(new Carta(8, "espadas"));
        System.out.println(p);
        System.out.println("-------------------\n");
        System.out.println(p.pop() + " saiu do monte");
        System.out.println(p.consultaTopo() + " esta no topo agora");
        System.out.println("a pilha:\n" + p);
        System.out.println("-------------------\n");
        while (!p.estaVazia()) {
            System.out.println(p.pop() + " saiu do monte");
            System.out.println(p + "\n----------------\n");
        }
    }
}

public class TesteNo {
    public static void main(String[] args) {
        Carta c1 = new Carta(5, "ouros");
        No<Carta> no1 = new No<Carta>(c1);

        Carta c2 = new Carta(3, "paus");
        No<Carta> no2 = new No<>(c2);

        No<String> no3 = new No<>("Hello World");

        No<Integer> no4 = new No<Integer>(8);

        No<No> no5 = new No<>(no1);

        System.out.println("c1: " + c1);
        System.out.println("no1: " + no1);
        System.out.println("no5: " + no5);

        System.out.println("no da string: " + no3);
        System.out.println("no do integer: " + no4);

    }
}

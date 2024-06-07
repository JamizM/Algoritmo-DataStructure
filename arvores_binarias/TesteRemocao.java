public class TesteRemocao {
    public static void main(String[] args) {
        ABB abb = new ABB();
        abb.insere(40);
        abb.insere(20);
        abb.insere(60);
        abb.insere(50);
        abb.insere(45);
        abb.insere(42);
        abb.insere(55);
        abb.insere(70);
        abb.insere(65);
        abb.insere(63);
        abb.insere(80);
        abb.insere(30);
        System.out.println(abb.inOrder());
        if (abb.removeElemento(40))
            System.out.println(40 + " removido");
        else
            System.out.println(40 + " nao encontrado");
        if (abb.removeElemento(100))
            System.out.println(100 + " removido");
        else
            System.out.println(100 + " nao encontrado");
        
        System.out.println(abb.inOrder());

        if (abb.removeElemento(42))
            System.out.println(42 + " removido");
        else
            System.out.println(42 + " nao encontrado");
        System.out.println(abb.inOrder());
    }
}

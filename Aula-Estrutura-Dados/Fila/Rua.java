package Fila;

//teste para Fila e No classes
public class Rua {
    public static void main(String[] args) {
        Fila <Carro> f = new Fila<>();
        System.out.println(f);
        Carro c1 = new Carro("ABC1234", 2010); // FIFO primeiro a entrar primeiro a sair
        Carro c2 = new Carro("DHI456", 2014);

        f.enfilera(c1);
        System.out.println(f);

        f.enfilera(c2);
        System.out.println(f);

        f.enfilera(new Carro("MNP7890", 2020));
        System.out.println(f);
        System.out.println("---------------");

        System.out.println("Fila apois " + f.desenfilera() + " sair");
        System.out.println(f);
    }
}

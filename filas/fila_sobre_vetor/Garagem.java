public class Garagem {
    public static void main (String[] args) {
        FilaGenerica <Carro> garagem = new FilaGenerica<>();
        int ano = 2018;
        int i = 1010;
        while (!garagem.estaCheia()) {
            garagem.enfileira(new Carro("ABC" + i++, ano++));
            System.out.println(garagem); 
        }
        while (!garagem.estaVazia()) {
            System.out.println (garagem.desinfileira() + " foi embora");
        }
    }
}
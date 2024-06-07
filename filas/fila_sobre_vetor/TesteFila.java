import java.util.Random;
public class TesteFila {
    public static void main (String[] args) {
        Random random = new Random();
        Fila f = new Fila();
        do {
            if (random.nextBoolean()) {
                if (!f.estaCheia())
                    f.enfileira(random.nextInt(10));
            }
            else {
                if (!f.estaVazia())
                    System.out.println(f.desinfileira() + " foi atendido");
            }
            System.out.println(f);
            f.mostraVetor();
        } while (!f.estaVazia());
    }
}
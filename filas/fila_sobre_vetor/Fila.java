public class Fila {
    private int primeiro;
    private int ultimo;
    private int quantidade;
    private int[] elementos;

    public static final int CAPACIDADE_MINIMA = 10;

    public Fila (int capacidade) {
        elementos = capacidade > 10 ? new int[capacidade] : new int[CAPACIDADE_MINIMA];
        primeiro = 0;
        ultimo = elementos.length - 1;
        quantidade = 0;
    }
    public Fila () {
        this(CAPACIDADE_MINIMA);
    }

    public boolean estaVazia () {
        return quantidade == 0;
    }
    public boolean estaCheia () {
        return quantidade == elementos.length;
    }
    private int proxima (int posicao) {
        return (posicao + 1) % elementos.length;
    }
    public boolean enfileira (int o) {
        if (estaCheia()) 
            return false;
        ultimo = proxima(ultimo);
        elementos[ultimo] = o;
        quantidade++;
        return true;
    }
    public int desinfileira () {
        if (estaVazia())
            return -1;
        int temp = elementos[primeiro];
        primeiro = proxima(primeiro);
        quantidade--;
        return temp;
    }
    @Override
    public String toString () {
        if (estaVazia())
            return "fila vazia";
        String s = "";
        int i=primeiro;
        do {
            s += elementos[i] + " ";
            i = proxima(i);
        } while (i != proxima(ultimo));
        return s;
    }
    public void mostraVetor () {
        if (estaVazia()) {
            System.out.print("_ _ _ _ _ _ _ _ _ _");
        }
        else if (primeiro <= ultimo) {
            for (int i=0; i < primeiro; i++)
                System.out.print ("_ ");
            for (int i=primeiro; i <= ultimo; i++)
                System.out.print (elementos[i] + " ");
            for (int i=ultimo + 1; i < elementos.length; i++)
                System.out.print ("_ ");
        }
        else {
            for (int i=0; i <= ultimo; i++)
                System.out.print (elementos[i] + " ");
            for (int i=ultimo + 1; i < primeiro; i++)
                System.out.print ("_ ");
            for (int i=primeiro; i < elementos.length; i++)
                System.out.print (elementos[i] + " ");
        }
        System.out.println();
    }
}

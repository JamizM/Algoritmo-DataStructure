package Fila.Fila_Sobre_Vetor;

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
    private int proxima (int posicao) { //método que faz enxergar o proximo elemento
        return (posicao + 1) % elementos.length;
    }
    public boolean enfileira (int o) { //recebe objeto, no qual se estiver cheio retorna false, ou redimensiona
        if (estaCheia()) 
            return false;
        ultimo = proxima(ultimo);
        elementos[ultimo] = o;
        quantidade++; //atualiza
        return true;
    }
    public int desinfileira () {
        if (estaVazia())
            return -1; //-1 pois o método é "int" 
        int temp = elementos[primeiro];
        primeiro = proxima(primeiro);
        quantidade--; //atualiza
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
    public void mostraVetor(){
        //esta vazia, <= utimo, 
        if(estaVazia()){
            System.out.print("_ _ _ _ _ _ _ _ _ _");
        }
        else if (primeiro <= ultimo){
            for (int i = 0; i < primeiro; i++){
                System.out.println("_ ");
            }
            for (int i = primeiro; i <= primeiro; i++){
                System.out.println(elementos[i] + " ");
            }
            for (int i = ultimo + 1; i < elementos.length; i++){
                System.out.println("_ ");
            }
        }
        else{
            for (int i = 0; i < ultimo; i++){
                System.out.println(elementos[i] + " ");
            }
            for (int i = ultimo + 1; i < primeiro; i++){
                System.out.println("_ ");
            }
            for (int i = primeiro + 1; i < elementos.length; i++){
                System.out.println(elementos[i] + " ");
            }
        }
    }
}
package Pilha.ExercicioBeeCrowd_1069;
 
public class Pilha {
    private No topo;
    private int tamanho;
    //construtor padrão
    public boolean estaVazia() {
        return topo == null;
    }
    public void push (char info) {
        No novo = new No(info);
        if (!estaVazia()) novo.setProximo(topo);
        topo = novo;
    }
    public char pop () {
        char info = topo.getInfo();
        topo = topo.getProximo();
        return info;
    }
    public char consultaTopo () {
        return topo.getInfo();
    }
    public int getTamanho() {
        return tamanho;
    }
    @Override
    public String toString () {
        if (estaVazia()) return "pilha vazia";
        String s = "";
        No aux = topo;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getProximo();
        }
        return s;
    }
}
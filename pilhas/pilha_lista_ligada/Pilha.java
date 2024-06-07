public class Pilha {
    private No topo;
    public Pilha () {
        topo = null;
    }
    public boolean estaVazia() {
        return topo == null;
    }
    public void push (int i) {
        No novo = new No(i);
        if (!estaVazia()) 
            novo.setProximo(topo);
        topo = novo;
    }
    public int pop () {
        int i = topo.getInfo();
        topo = topo.getProximo();
        return i;
    }
    @Override
    public String toString() {
        String s = "pilha: ";
        if (estaVazia()) {
            s += "vazia";
        }
        else {
            No aux = topo;
            while (aux != null) {
                s += aux + "\n";
                aux = aux.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
}

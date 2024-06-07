public class Lista {
    private No primeiro;
    //por clareza
    public Lista () {
        primeiro = null;
    }
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insere (Pessoa i) {
        No novo = new No(i);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    @Override
    public String toString() {
        String s = "";
        if (estaVazia()) {
            s += "----";
        }
        else {
            No aux = primeiro;
            while (aux != null) { //percorre a lista até o final
                s += aux;
                aux = aux.getProximo();
            }
        }
        return s + "\n";
    }
    public Pessoa remove () {
        Pessoa i = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return i;
    }
}

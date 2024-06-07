public class Lista {
    private No primeiro;
    //por clareza
    public Lista () {
        primeiro = null;
    }
    public No getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro (No primeiro) {
        this.primeiro = primeiro;
    }
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int i) {
        No novo = new No(i);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s += "vazia";
        }
        else {
            No aux = primeiro;
            while (aux != null) { //percorre a lista até o final
                s += aux;
                aux = aux.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
    public void insereFim (int i) {
        No novo = new No(i);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            No aux = primeiro;
            while (aux.getProximo() != null) {//percorre até o último da lista
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }
    public int removeInicio () {
        int i = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return i;
    }
    public int removeFim () {
        int i;
        if (primeiro.getProximo() == null) {//tem um elemento só
            i = primeiro.getInfo();
            primeiro = null;
        }
        else {
            No aux = primeiro;
            while (aux.getProximo().getProximo() != null) {//percorre até o penúltimo
                aux = aux.getProximo();
            }
            i = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return i;
    }
    public boolean removePrimeiraOcorrencia (int x) {
        if (estaVazia()) return false;
        if (primeiro.getInfo() == x) {
            primeiro = primeiro.getProximo();
            return true;
        }
        //busca
        boolean achou = false;
        No ant = primeiro;
        No atual = primeiro.getProximo();
        while (atual != null && !achou) {
            if (atual.getInfo() == x) {
                achou = true;
            }
            else {
                ant = atual;
                atual = atual.getProximo();
            }
        }
        if (!achou) return false;
        ant.setProximo(atual.getProximo());
        return true;
    }
}

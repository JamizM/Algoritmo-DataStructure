public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    //construtor padrão
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int info) {
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    public void insereFim(int info){
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public int removeInicio() {
        int info = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou a lista
            ultimo = null;
        else
            primeiro.setAnterior(null);
        return info;
    }
    public int removeFim() {
        int info = ultimo.getInfo();
        ultimo = ultimo.getAnterior();
        if (ultimo == null)
            primeiro = null;
        else
            ultimo.setProximo(null);
        return info;
    }
    @Override
    public String toString () {
        String s = "";
        if (estaVazia()) {
            s += "lista vazia";
        }
        else {
            s += "//=";
            NoDuplo aux = primeiro;
            while (aux != null) {
                s += aux + "=";
                aux = aux.getProximo();
            }
            s+= "//";
        }
        return s;
    }
    public boolean removePrimeiraOcorrencia (int x) {
        if (estaVazia()) return false;
        if (primeiro.getInfo() == x) {
            primeiro = primeiro.getProximo();
            if (primeiro == null) {//esvaziou a lista
                ultimo = null;
            }
            return true;
        }
        //busca
        NoDuplo atual = primeiro.getProximo(); //começa do segundo
        boolean achou = false;
        while (atual != null && !achou) {
            if (atual.getInfo() == x) achou = true;
            else atual = atual.getProximo();
        }
        if (!achou) return false;
        if (atual == ultimo) {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        else {
            atual.getAnterior().setProximo(atual.getProximo());
            atual.getProximo().setAnterior(atual.getAnterior());
        }
        return true;
    }
}

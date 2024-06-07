import java.util.ArrayList;

public class ABB {
    private No raiz;

    public boolean estaVazia () {
        return raiz == null;
    }

    public void insere (int info) {
        No novo = new No(info);
        if (estaVazia()) raiz = novo;
        else insereRec (novo, raiz);
    }
    void insereRec (No novo, No atual) {
        if (novo.getInfo() <= atual.getInfo()) {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(novo);
            else 
                insereRec(novo, atual.getEsquerda());
        }
        else {
            if (atual.getDireita() == null)
                atual.setDireita(novo);
            else 
                insereRec(novo, atual.getDireita());
        }
    }
    public String inOrder () {
        if (estaVazia()) return "arvore vazia";
        return inOrderRec(raiz);
    }
    public String inOrderRec (No atual) {
        if (atual == null) return "";
        return
            inOrderRec(atual.getEsquerda()) +
            " " + atual.getInfo() + 
            inOrderRec(atual.getDireita());
    }
    public int numeroNos () {
        if (estaVazia())
            return 0;
        return numeroNosRec(raiz);
    }
    int numeroNosRec (No atual) {
        if (atual == null) return 0;
        return numeroNosRec(atual.getEsquerda()) + 1 + numeroNosRec(atual.getDireita());
    }
    public int altura () {
        if (estaVazia()) return 0;
        return alturaRec(raiz);
    }
    int alturaRec (No atual) {
        if (atual.getEsquerda() == null && atual.getDireita()==null) //não tem filhos
            return 0; 
        int alturaDir = 0;
        int alturaEsq = 0;
        if (atual.getEsquerda() != null) 
            alturaEsq = alturaRec(atual.getEsquerda());
        if (atual.getDireita() != null)
            alturaDir = alturaRec(atual.getDireita());
        return alturaEsq > alturaDir ? alturaEsq + 1 : alturaDir + 1;
    }
    public int numeroFolhas () {
        if (estaVazia()) return 0;
        return numeroFolhasRec (raiz);
    }
    int numeroFolhasRec (No atual) {
        if (atual == null) return 0;
        if (atual.getDireita() == null && atual.getEsquerda() == null) return 1;
        return numeroFolhasRec(atual.getDireita()) + numeroFolhasRec(atual.getEsquerda());
    }
    public boolean existe (int x) {
        if (estaVazia()) return false;
        return existeRec (x, raiz);
    }
    boolean existeRec (int x, No atual) {
        if (atual == null) return false;
        if (x == atual.getInfo()) return true;
        if (x < atual.getInfo()) return existeRec (x, atual.getEsquerda());
        return existeRec(x, atual.getDireita());
    }
    public int proximo (int x) {
        if (estaVazia () || !existe (x)) return -1; //decisão de projeto
        ArrayList<Integer> lista = new ArrayList<>();
        linearizaRec (lista, raiz);
        //System.out.println(lista);
        int posicao = lista.indexOf(x);
        return posicao == lista.size() - 1 ? -1 : lista.get(posicao+1);
    }
    void linearizaRec (ArrayList lista, No atual) {
        if (atual != null) {
            linearizaRec(lista, atual.getEsquerda());
            lista.add(atual.getInfo());
            linearizaRec(lista, atual.getDireita());
        }
    }
    public boolean removeElemento (int x) {
        if (estaVazia()) return false;
        return removeElementoRec(x, raiz, null, false);
    }
    boolean removeElementoRec (int x, No atual, No pai, boolean eFilhoEsquerdo) {
        if (atual != null) {
            if (x == atual.getInfo()) {
                if (atual.getEsquerda() == null && atual.getDireita() == null) {
                    //não tem filhos
                    if (atual == raiz) {
                        raiz = null;
                    }
                    else if (eFilhoEsquerdo) {
                        pai.setEsquerda(null);
                    }
                    else {
                        pai.setDireita(null);
                    }
                }
                else if (atual.getDireita() == null) {
                    //só tem filho esquerdo
                    if (atual == raiz) {
                        raiz = atual.getEsquerda();
                    }
                    else if (eFilhoEsquerdo) {
                        pai.setEsquerda(atual.getEsquerda());
                    }
                    else {
                        pai.setDireita(atual.getEsquerda());
                    }
                }
                else if (atual.getEsquerda() == null) {
                    //só tem filho direito
                    if (atual == raiz) {
                        raiz = atual.getDireita();
                    }
                    else if (eFilhoEsquerdo) {
                        pai.setEsquerda(atual.getDireita());
                    }
                    else {
                        pai.setDireita(atual.getDireita());
                    }
                }
                else {
                    //tem os 2 filhos
                    //a sub-árvore da direita é "adotada" pelo nó pai
                    if (atual == raiz) {
                        raiz = atual.getDireita();
                    }
                    else if (eFilhoEsquerdo) {
                        pai.setEsquerda(atual.getDireita());
                    }
                    else {
                        pai.setDireita(atual.getDireita());
                    }
                    //a subárvore da esquerda é "adotada" pelo nó sucessor
                    //sucessor é o menor entre os maiores
                    No sucessor = atual.getDireita();
                    while (sucessor.getEsquerda() != null) {
                        sucessor = sucessor.getEsquerda();
                    }
                    sucessor.setEsquerda(atual.getEsquerda());
                }
                return true;
            }
            else if (x < atual.getInfo()) {
                eFilhoEsquerdo = true;
                pai = atual;
                return removeElementoRec(x, atual.getEsquerda(), pai, eFilhoEsquerdo);
            }
            else {
                return removeElementoRec(x, atual.getDireita(), atual, false);
            }
        }
        return false;
    }
}

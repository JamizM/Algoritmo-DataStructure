public class ABB {
    private No raiz;

    public boolean estaVazia () {
        return raiz == null;
    }
    public void insere (int info) {
        if (estaVazia()) raiz = new No(info);
        else insereRec (info, raiz);
    }
    void insereRec (int info, No atual) {
        if (info == atual.getInfo())
            atual.incrementaQuantidade();
        else if (info < atual.getInfo()) {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(new No(info));
            else 
                insereRec(info, atual.getEsquerda());
        }
        else {
            if (atual.getDireita() == null)
                atual.setDireita(new No(info));
            else 
                insereRec(info, atual.getDireita());
        }
    }
    public String inOrder () {
        if (estaVazia()) return "arvore vazia";
        return inOrderRec(raiz);
    }
    public String inOrderRec (No atual) {
        if (atual == null) return "";
        
        String s = "";
        //sub-árvore da esquerda
        s += inOrderRec(atual.getEsquerda());
        //raiz
        for (int i=1; i<=atual.getQuantidade(); i++)
            s += atual.getInfo() + " ";
        //sub-árvore da direita
        s += inOrderRec(atual.getDireita());
        return s;
    }
    public int numeroNos () {
        if (estaVazia()) 
            return 0;
        return numeroNosRec(raiz);
    }
    int numeroNosRec (No atual) {
        if (atual == null)
            return 0;
        return numeroNosRec(atual.getEsquerda()) + 1 + numeroNosRec(atual.getDireita());
    }
    public int altura () {
        if (estaVazia()) return 0;
        return alturaRec(raiz);
    }
    int alturaRec (No atual) {
        if (atual.getEsquerda() == null && atual.getDireita()==null) //não tem filhos
            return 0; 
        
        int alturaEsq = atual.getEsquerda() != null ?  alturaRec(atual.getEsquerda()) : 0;

        int alturaDir = 0;
        if (atual.getDireita() != null)
            alturaDir = alturaRec(atual.getDireita());
        
        return alturaEsq > alturaDir ? alturaEsq + 1 : alturaDir + 1;
    }
    //encontrar o maior elemento
    public int maior () {
        No aux = raiz;
        while (aux.getDireita() != null) 
            aux = aux.getDireita();
        return aux.getInfo();
    }

    //encontrar a quantidade de nós folha
    public int folhas () {
        if (estaVazia()) return 0;
        return folhasRec (raiz);
    }
    int folhasRec (No atual) {
        if (atual == null) return 0;

        if (atual.getDireita() == null && atual.getEsquerda() == null) return 1;
            
        return folhasRec(atual.getDireita()) + folhasRec(atual.getEsquerda());
        
    }
}

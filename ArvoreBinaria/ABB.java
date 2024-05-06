package ArvoreBinaria;

public class ABB {
    private No raiz;

    public boolean estaVazia(){
        return raiz == null;
    }

    void insereRec(No novo, No atual ){
        if (novo.getInfo() <= atual.getInfo()){
            if(atual.getEsquerda() == null){
                atual.setEsquerda(novo); //recebe referencia do novo nó, no qual acabou de entrar
            }
            else{
                insereRec(novo, atual.getEsquerda()); //recursao    
            }
        }
        else{
            if(atual.getDireita() == null){
                atual.setDireita(novo);
            }
            else{
                insereRec(novo, atual.getDireita()); //atual.getDireita() -> atualiza a raiz da arvore e faz com que atualiza para a raiz de tras
            }
        }
    }

    public void insere(int info){
        No novo = new No(info);
        if(estaVazia()){
            raiz = novo;
        }
        else{
            insereRec(novo, raiz); //nos parametros = novo > valor inserido, raiz > posicao no qual foi inserido
        }
    }

    public String inOrder(){
        if(estaVazia()) return "arvore vazia";
        return inOrderRec(raiz);
    }

    public String inOrderRec(No atual){
        if(atual == null) return "";
        return 
        inOrderRec(atual.getEsquerda()) 
        + " " + atual.getInfo() + 
        inOrderRec(atual.getDireita());
    }
}

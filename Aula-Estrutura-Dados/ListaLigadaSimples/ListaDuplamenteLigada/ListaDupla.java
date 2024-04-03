package ListaLigadaSimples.ListaDuplamenteLigada;

public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;

    public boolean estaVazia(){
        return primeiro == null;
    }
    public void insereInicio(int info){
        NoDuplo novo = new NoDuplo(info);
        if (!estaVazia()){
            ultimo = novo;
        }
        else{
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo; //insercao de inicio
    }
    public void insereFim(int info){
        NoDuplo novo = new NoDuplo(info);
        if(estaVazia()){
            primeiro = novo;    
        }
        else{
            novo.setAnterior(ultimo); //mudar o anterior pare receber o ultimo
            ultimo.setProximo(novo); //mudar o ultimo e modifica o "novo" 
        }
        ultimo = novo; //ultimo recebe o valor no qual o ultimo armazenava, e armazena o valor de "novo" para a variavel ultimo
    }
    public int removeInicio(){
        int i = primeiro.getInfo(); //guardada a variavel i dentro da caixinha, aonde primeiro e ultimo estao apontando
        primeiro =  primeiro.getProximo();
        if(primeiro == null){ //se primeiro é igual a null, entao o utlimo tambem é null
            ultimo = null;
        }
        else{//se caso o primeiro tiver o endereço no segundo 
            primeiro.setAnterior(null); //celula anterior corta e fica como null
        }
        return i;
    }
    public int removeFim(){
        int i = ultimo.getInfo();
        ultimo = ultimo.getAnterior();

        if(ultimo == null){
            primeiro = null;
        }
        else{
            ultimo.setProximo(null); //define como o proximo é igual a null 
        }
        return i;
    }
    @Override
    public String toString(){
        String s = ""; 
        if (estaVazia()){
            s += "esta vazia";
        }
        else{
            s += "//=";
            NoDuplo aux = primeiro;
            while (aux != null) {
                s += aux + "="; 
                aux = aux.getProximo();
            }
            s += "//+";
        }
        return s;
    }
    public boolean removePrimeira(int x){
        if(estaVazia()) return false;
        if (primeiro.getInfo() == x){
            primeiro = primeiro.getProximo();
            if(primeiro == null){
                ultimo = null;
            }
            else{
                return false;
            }
        }

        NoDuplo atual = primeiro.getProximo();
        boolean achou = false;
        while (atual != null &&  !achou){
            if(atual.getInfo() == x) achou = true;
            else{
                atual = atual.getProximo();
            }
        } 
        if(!achou) return false;
        if(atual == ultimo){
            ultimo = ultimo.getAnterior(); //ajuste de ponteiro para o anterior no atual que ele ta
            ultimo.setProximo(null);//ajusta de ponteiro para o proximo do atual que ele esta
        }
        else{   
            atual.getProximo().setProximo(atual.getProximo());
            atual.getProximo().setAnterior(atual.getAnterior());
        }
        return true;
    }
    
}

package ListaLigadaSimples;

public class Lista {
    private No primeiro;

    public Lista(){ //não precisa escrever, pois o Java cuida disto
        primeiro = null;
    }
    public No getPrimeiro(){
        return primeiro;
    }
    public void setPrimeiro(No primeiro){ //se houver uma regra de validação o setPrimeiro ira dar conta 
        this.primeiro = primeiro;
    }
    public boolean listaEstaVazia(){
        return primeiro == null; //lista que aponta para o primeiro elemento que aponta para nul, a partir desta linha
    }
    public void insereInicio(int i){
        No novo = new No(i);
        if (!listaEstaVazia()){ //se caso a lista nao estiver vazia, adicione o primeiro elemento a lista 
            novo.setProximo(primeiro); 
        }
        primeiro = novo;
    }
    @Override
    public String toString(){
        String s = "lista: ";
        if (listaEstaVazia()){
            s += "vazia";
        }   
        else{
            No aux = primeiro; //variavel auxilar que guarda referencia do primeiro elemento
            while (aux != null){ //percorre a lista ate o final
                s += aux;//processamento da informação
                aux = aux.getProximo(); //aqui ele ira na célula do proximo elemento e vai buscar o proximo elemento
            }
            s += "\\";
        }

        return s + "\n";
    }
    public void insereFim(int i){
        No novo = new No(i);

        if(listaEstaVazia()){
            primeiro = novo; //guardar endereço da informação novo no "primeiro" 
        }
        else{
            No aux = primeiro;
            while (aux.getProximo() != null){ //percorre ate o ultimo da lista 
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }

    }
    public int removeInicio(){
        int i = primeiro.getInfo();
        primeiro = primeiro.getProximo(); //primeiro passa a ser o proximo
        return i;
    }
    public int removeFim(){
        //para sabermos o ultimo da lista, precisamos pegar o penultimo elemento dentro da lista
        int i;
        if (primeiro.getProximo() == null){ //SE TEM UM ELEMENTO SO
            i = primeiro.getInfo();
            primeiro = null;
        }
        else{
            No aux = primeiro; //posiciona no primeiro
            while (aux.getProximo().getProximo() != null) { //percorre ate o penultimo
                aux = aux.getProximo(); 
            }
            i = aux.getProximo().getInfo(); //pegar o penultimo elemento 
            aux.setProximo(null); //aqui ele esta no ultimo elemento e irá definir o ultimo como null
        }

        return i;
    }
    public boolean removePrimeiraOcorrencia(int elemento){
        if(listaEstaVazia()) return false;
        if (primeiro.getInfo() == elemento){ //getInfo() pegar informação do dado la dentro para ver se bate com o elemento digitado
            primeiro = primeiro.getProximo();
            return true;
        }
        boolean achou = false; //mecanismo de busca
        No ant = primeiro; //posicinado uma para tras 
        No atual = primeiro.getProximo(); // proximo do valor que esta a traz
        while(atual != null && !achou){
            if(atual.getInfo() == elemento){ //elemento achado dentro da lista 
                achou = true;
            }
            else{
                ant = atual;
                atual = atual.getProximo();
            }
            if(!achou) return false;
            //ajustar ponteiros
            ant.setProximo(atual.getProximo()); //se caso achou, ajustando vetor para o proximo do elemento que achou, para o proximo
        }
        return true;
    }
    
}

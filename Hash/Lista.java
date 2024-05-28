
public class Lista {
    private No primeiro;

    public Lista(){ //não precisa escrever, pois o Java cuida disto
        primeiro = null;
    }
    public boolean listaEstaVazia(){
        return primeiro == null; //lista que aponta para o primeiro elemento que aponta para nul, a partir desta linha
    }
    public void insereInicio(Pessoa i){
        No novo = new No(i);
        if (!listaEstaVazia()){ //se caso a lista nao estiver vazia, adicione o primeiro elemento a lista 
            novo.setProximo(primeiro); 
        }
        primeiro = novo;
    }
    @Override
    public String toString(){
        String s = "";
        if (listaEstaVazia()){
            s += "";
        }   
        else{
            No aux = primeiro; //variavel auxilar que guarda referencia do primeiro elemento
            while (aux != null){ //percorre a lista ate o final
                s += aux;//processamento da informação
                aux = aux.getProximo(); //aqui ele ira na célula do proximo elemento e vai buscar o proximo elemento
            }
        }

        return s + "\n";
    }
    public Pessoa remove(){
        Pessoa i = primeiro.getInfo();
        primeiro = primeiro.getProximo(); //primeiro passa a ser o proximo
        return i;
    }
}

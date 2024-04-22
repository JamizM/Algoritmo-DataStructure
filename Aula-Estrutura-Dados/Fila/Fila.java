package Fila;

public class Fila <E>{
    private No<E> ultimo; //ultimo elemento da lista 
    //construtor
    private No<E> primeiro;
    //tirado o getUltimo, pois havera o principio do menor privilegio, pois para o usuario nao importa isso
    public boolean estaVazia(){
        return primeiro == null;
    }
    public void enfilera(E i){
        No<E> novo = new No<>(i); //no new No, pode receber o "E" dentro do operador diamanete, mas importante lembrar que é um cosntrutor
        if (estaVazia()){
            primeiro = novo;
        }
        else{
            ultimo.setProximo(novo);
        }
        ultimo = novo;
        //criado novo no
        //se a lista estiver vazia, ira receber um novo, se nao, o ponteiro do final ira receber o novo No do utlimo que esta entra
    }
    public E desenfilera(){ //imporante tirar os elementos da fila para jogar para outra aplicacao, no qual mantem na memória
        if (estaVazia()){
            return null;
        }
        E temp = primeiro.getInfo();
        primeiro = primeiro.getProximo(); //primeiro ira ver o proximo elemento
        if (primeiro == null){
            ultimo = null; //quando nao há elementos na fila para desenfileirar, o utlimo ira receber um nulo
        }
        return temp;
    }
    @Override
    public String toString(){
        if (estaVazia()){
            return "fila vazia";
        }
        String s = "";
        No<E> aux = primeiro;
        while(aux != ultimo){ //definido com "ultimo" e nao "null", pois ele ainda precisa estar no ~laço
            s += aux + " - ";
            aux = aux.getProximo();
        }
        s += aux;
        return s;
    }
}

class No <E>{ //este no pode ter qualquer coisa, porem quando for instanciado, será neessário definir quais parametros ele ira receber
    private E info;
    private No<E> proximo;
    public No (E info){
        this.info = info;
        setProximo(null); //escrever por clareza 
    }
    //getters
    public E getInfo(){
        return info;
    }
    public No<E> getProximo(){ //obtenha endereço do proximo elemento
        return proximo;
    }
    //setters
    public void setInfo(E info){
        this.info = info;
    }
    public void setProximo(No<E> proximo){ //passa uma referencia ao getProximo, atribui a ele ||||||||||| No<E> -> da classe No que passa referencia para o <E> 
        //no Set é aonde estabelecemos as regras de negócios
        this.proximo = proximo;
    }
    @Override
    public String toString(){ //representação textual de um objeto, como quer q um objeto seja apresentado
        return "" + info; 
        //? aqui enganamos o java para podermos nos devolver uma String, pois a classe "int" obtem um toString, porem no contexto do método, nao ha maneiras de transformalo ele, assim forçamos com "";
    }
}

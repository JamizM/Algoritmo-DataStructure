package ListaLigadaSimples;

public class ListaComUltimo extends Lista{
    private No ultimo; //ultimo elemento da lista 
    //construtor
    public No getUltimo(){
        return ultimo;
    }
    @Override //override pois vamos sobreescrever o método
    public void insereFim(int i){
        No novo = new No(i);
        if (listaEstaVazia()){
            setPrimeiro(novo);
        }
        else{
            ultimo.setProximo(novo); //refaz esta ligacao
        }
        ultimo = novo;

    }
    public void setUltimo(No ultimo){
        this.ultimo = ultimo;
    }

    //Exercicio: implemenar o insereInicio() o removeInicio() e o removefim()
}

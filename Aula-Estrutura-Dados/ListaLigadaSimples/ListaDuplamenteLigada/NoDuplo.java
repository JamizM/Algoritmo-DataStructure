package ListaLigadaSimples.ListaDuplamenteLigada;

public class NoDuplo {
    private int info;
    private NoDuplo anterior;
    private NoDuplo proximo;

    public NoDuplo (int info){
        setInfo(info); //recebe  ainformação sobre o numero que será recebido
        setProximo(null);
        setAnterior(null);
    }
    public int getInfo(){
        return info;
    }
    public NoDuplo getProximo(){
        return proximo;
    }
    public NoDuplo getAnterior(){
        return anterior;
    }
    public void setInfo(int info){
        this.info = info;
    }
    public void setProximo(NoDuplo proximo){
        this.proximo = proximo;
    }
    public void setAnterior(NoDuplo anterior){
        this.anterior = anterior;
    }
    @Override
    public String toString(){
        return "|" + info + "|=";

    }
}

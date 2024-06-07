public class No {
    private int info;
    private No proximo;
    //construtor para armazenar uma informação
    public No (int info) {
        this.info = info;
        setProximo(null); //por clareza
    }
    public int getInfo() {
        return info;
    }
    public No getProximo () {
        return proximo;
    }
    public void setInfo (int info) {
        this.info = info;
    }
    public void setProximo (No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "|" + info + "|->";
    }
}
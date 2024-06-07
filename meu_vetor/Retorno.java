public class Retorno {
    int contador;
    boolean achou;
    //só o construtor que zera tudo
    public int getContador() {
        return contador;
    }
    public boolean getAchou() {
        return achou;
    }
    public void incrementaContador() {
        contador++;
    }
    public void setAchou (boolean achou) {
        this.achou = achou;
    }
}

public class Retorno {
    int contador;
    boolean achou;

    //construtor que zera tudo
    public int getContador(){
        return contador;
    }
    public boolean getAchou(){
        return achou;
    }

    public void incrementaContador(){
        contador++; //usamos o this, referenciando o "contador" declarado nas linhas iniciais deste arquivo
        //quando nao há nada no parametro agora, ele nao tem para quem olhar a não ser o "contador" declarado la em cima. Porém, nao há problema de colocar "this".
    }
    public void setAchou(boolean achou){
        this.achou = achou;
    }
}

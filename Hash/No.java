
//Aplicando conceitos de lista ligada
public class No{
    private Pessoa info;
    private No proximo;//definição recursiva
    //construtor para armazenar uma informação
    public No (Pessoa info){
        this.info = info;
        setProximo(null); //escrever por clareza 
    }
    //getters
    public Pessoa getInfo(){
        return info;
    }
    public No getProximo(){ //obtenha endereço do proximo elemento
        return proximo;
    }
    //setters
    public void setInfo(Pessoa info){
        this.info = info;
    }
    public void setProximo(No proximo){ //passa uma referencia ao getProximo, atribui a ele
        //no Set é aonde estabelecemos as regras de negócios
        this.proximo = proximo;
    }
    @Override
    public String toString(){ //representação textual de um objeto, como quer q um objeto seja apresentado
        return "|" + info + "|->"; //nao usado a referencia proximo, pois não sabemos se tem alguem referenciando ele
    }
    
}
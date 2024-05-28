public class Pessoa {
    private String nome;
    private Integer anoNascido;
    public Pessoa(String nome, Integer anoNascido) {
        this.nome = nome;
        this.anoNascido = anoNascido;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getAnoNascido() {
        return anoNascido;
    }
    public void setAnoNascido(Integer anoNascido) {
        this.anoNascido = anoNascido;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", anoNascido=" + anoNascido + "]";
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj instanceof Pessoa){
            Pessoa pessoa = (Pessoa) obj;
            if(this.nome == pessoa.getNome())return true;
        } 
        return false;
    }
    
}
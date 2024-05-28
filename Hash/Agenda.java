public class Agenda {
    private static final String mapa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private Pessoa[] contatos;

    public Agenda(){
        contatos = new Pessoa[26]; //instanciar o tamanho de letras do alfabeto
    }

    public void insere(Pessoa pessoa){
        char primeiraLetra = pessoa.getNome().toUpperCase().charAt(0); //pega a primeira letra da pessoa
        int posicao = mapa.indexOf(primeiraLetra); //encontrar prosicao de caractere
        contatos[posicao] = pessoa;

        if (posicao >= 0 && posicao < contatos.length) {
            contatos[posicao] = pessoa;
        } else {
            System.out.println("Erro: Nome começa com um caractere inválido.");
        }
    }

    public Boolean existe(Pessoa pessoa){
        char primeiraLetra = pessoa.getNome().charAt(0);
        int posicao = mapa.indexOf(primeiraLetra);
        if(pessoa.equals(contatos[posicao])) return true; //se caso a pessoa estiver dentro da lista, ira retornar true, fazemos desta forma, pois quando fazer "pessoa == pessoa" pegamos a variavel de referencia e nao a classe pessoa dentro da hierarquia
        return true;
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i <26; i++){
            s += mapa.charAt(i) + "\n";
            s += contatos[i] + "\n";
        }
        return s;
    }
}







//promocao, quando fizemos uma operação de exemplo:
//double n
//int x 
//x + n ---> o compilador faz o inteiro virar double, e o resultado desta conta se transforma um double


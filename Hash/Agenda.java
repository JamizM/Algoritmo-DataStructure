public class Agenda {
    private static final String mapa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private Pessoa[] contatos;
    public Agenda () {
        contatos = new Pessoa[26];
    } 
    public void insere (Pessoa pessoa) {
        char primeiraLetra = pessoa.getNome().charAt(0);
        int posicao = mapa.indexOf(primeiraLetra);
        contatos[posicao] = pessoa;
    }
    public boolean existe (Pessoa pessoa) {
        char primeiraLetra = pessoa.getNome().charAt(0);
        int posicao = mapa.indexOf(primeiraLetra);
        if (pessoa.equals(contatos[posicao])) return true;
        return false;
    }
    @Override
    public String toString () {
        String s = "";
        for (int i=0; i<26; i++) {
            s = s + mapa.charAt(i) + "\n";
            s = s + contatos[i] + "\n";
        }
        return s;
    }
}

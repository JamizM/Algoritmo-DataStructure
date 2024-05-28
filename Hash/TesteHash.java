public class TesteHash {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(); //instanciado 26 posicao
        Pessoa pessoa1 = new Pessoa("rodrigo", 1920);
        agenda.insere(pessoa1); //inserido dentro da lista 

        System.out.println(agenda);
        if(agenda.existe(pessoa1)){
            System.out.println(pessoa1 + " esta na lista de contatos");
        }
        else{
            System.out.println(pessoa1 + " nao esta dentro da lista");
        }
        Pessoa pessoa2 = new Pessoa("MC kevin", 2022);
        if(agenda.existe(pessoa2)){
            System.out.println(pessoa2 + " esta na lista de contatos");
        }
        else{
            System.out.println(pessoa2 + " nao esta dentro da lista");
        }
    }
}

public class TesteComLista {
    public static void main(String[] args) {
        AgendaComLista agenda = new AgendaComLista();
        Pessoa p1 = new Pessoa("Ana", 2000);
        agenda.insere(p1);
        System.out.println(agenda);
        // if (agenda.existe(p1)) {
        //     System.out.println(p1 + " esta na lista de cotatos");
        // }
        // else {
        //     System.out.println(p1 + " nao esta na sua lista de contatos");
        // }
        Pessoa p2 = new Pessoa("Bia", 2010);
        agenda.insere(p2);
        // if (agenda.existe(p2)) {
        //     System.out.println(p2 + " esta na lista de cotatos");
        // }
        // else {
        //     System.out.println(p2 + " nao esta na sua lista de contatos");
        // }
        Pessoa p3 = new Pessoa("Antonio", 2001);
        agenda.insere(p3);
        System.out.println(agenda);
    }
}

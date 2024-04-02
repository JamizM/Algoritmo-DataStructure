package ListaLigadaSimples;

public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("lista foi construida: \n" + lista);
        for (int i = 1; i<6; i++){
            lista.insereInicio(i*10);
            System.out.println(lista);
        }
        for(int i=1; i<6; i++){
            lista.insereFim(i*10+5);
            System.out.println(lista);
        }
        if (lista.listaEstaVazia()) {
            System.out.println("Esta vazia");
        }
        else{
            System.out.println(lista.removeInicio() + " foi removido");
            System.out.println(lista);
        }
        if (lista.listaEstaVazia()) {
            System.out.println("Esta vazia");
        }
        else{
            System.out.println(lista.removeFim() + " foi removido");
            System.out.println(lista);
        }

        while (!lista.listaEstaVazia()) {
            System.out.println(lista.removeInicio() + " foi removido da lista ");
            System.out.println(lista);
        }
        // while (!lista.listaEstaVazia()) { //este aqui vai da direita para esquerda
        //     System.out.println(lista.removeFim() + " foi removido da lista ");
        //     System.out.println(lista);
        // }
    }
}

package ListaLigadaSimples.ListaDuplamenteLigada;
import java.util.Random;

public class TesteListaLigada {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla(); //dando erro
        Random random = new Random();
        for (int i = 0; i <= 20; i++){
            if (random.nextInt(2) == 0){
                System.out.println("inicio");
                listaDupla.insereInicio(random.nextInt(100));
            }
            else{
                System.out.println("fim");
                listaDupla.insereFim(random.nextInt(100));
            }
            System.out.println(listaDupla);
            for (int j = 0; j<20000000; j++);
        }
    }
}

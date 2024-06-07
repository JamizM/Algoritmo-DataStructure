import java.util.Random;

public class TesteListaDupla {
    public static void main(String[] args) {
        Random r = new Random();
        ListaDupla listaDupla = new ListaDupla();
        for (int i = 1; i <= 20; i++) {
            if (r.nextInt(2) == 0) {
                System.out.println("inicio");
                listaDupla.insereInicio(r.nextInt(100));
            }
            else {
                System.out.println("fim");
                listaDupla.insereFim(r.nextInt(100));
            }
            System.out.println(listaDupla);
            for (int j=0;j<2000000000;j++);
        }
    }
}

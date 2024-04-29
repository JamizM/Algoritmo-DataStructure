package Fila.Fila_Sobre_Vetor;

import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Random random = new Random();
        Fila fila = new Fila();

        do{
            if(random.nextBoolean()){
                if(!fila.estaCheia()){
                    fila.enfileira(random.nextInt(10));
                }
            }
            else{
                if(!fila.estaVazia()){
                    System.out.println(fila.desinfileira() + " foi atendido");
                }
            }
            fila.mostraVetor();
            System.out.println(fila);
        } while(!fila.estaVazia());
    }
}

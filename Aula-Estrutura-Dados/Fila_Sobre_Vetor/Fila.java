package Fila_Sobre_Vetor;

import java.util.Arrays;

public class Fila {
    private int primeiro;
    private int ultimo;
    private int qt;
    private Object[] elementos;

    public static final int CAP_MIN = 10;

    public Fila(){
        elementos = new Object[CAP_MIN];
        primeiro = 0;
        ultimo = elementos.length - 1; //tamanho do vetor - 1, para nao dar BoundExceptiom
        qt = 0;     
    }

    public Fila(int capacidade){
        elementos = new Object[capacidade];
        primeiro = 0;
        ultimo = elementos.length - 1;
        qt = 0;
    }

    public boolean estaVazia(){
        return qt == 0;
    }

    public boolean estaCheia(){
        return qt == elementos.length;
    }

    private int proximo(int pos){
        return (pos + 1) % elementos.length;
    }

    public boolean enfilera(Object o){
        if (estaCheia()) return false;
        ultimo = proximo(ultimo);
        elementos[ultimo] = 0;
        return true;
    }

    public Object desenfilera(){
        if (estaVazia()) return null;
        Object temp = elementos[primeiro];
        primeiro = proximo(primeiro);
        return temp;
    }

    @Override
    public String toString() {
        if (estaVazia()) return "Fila Vazia";
        String s = "";
        if(primeiro >= ultimo){
            for (int i = primeiro; i <= ultimo; i++){
                s += elementos[i] + " ";
            }
        }
        else{
            // continuar
        }
        return s;
    }

    
}


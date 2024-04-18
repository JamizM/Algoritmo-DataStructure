package ExerciciosPraticaP1;

import java.util.Random;

public class MeuVetor1 {
    private double[] v;
    private int ultimaPos;

    public MeuVetor1 (int capacidade) {
        v = new double[capacidade];
        ultimaPos = -1;
    }
    //métodos de acesso
    public int getUltimaPos (){
        return ultimaPos;
    } 
    public double[] getV () {
        return v;
    }
    //métodos modificadores
    public void setUltimaPos(int pos) {
        if (pos >=0 && pos < v.length) {
            ultimaPos = pos;
        }
        else {
            ultimaPos = v.length - 1;
        }
    }
    public boolean estaCheio () {
        return ultimaPos == v.length - 1;
    }
    public boolean estaVazio() {
        return ultimaPos == -1;
    }
    private void redimensiona (int novaCapacidade) {
        double[] temp = new double[novaCapacidade];
        for (int i=0; i<=ultimaPos; i++)
            temp[i] = v[i];
        v = temp;
    }
    public void adiciona (double e){
        if (estaCheio()) redimensiona(v.length*2);
        v[++ultimaPos] = e;
    }
    public double remove () {
        if (estaVazio()) return 0;
        double aux = v[ultimaPos--];
        if (v.length>=10 && ultimaPos <= v.length/4) redimensiona(v.length/2);
        return aux;
    }

    @Override
    public String toString () {
        String s = "";
        if (estaVazio()) {
            s = s + "esta vazio";
        }
        else {
            for (int i=0; i<=ultimaPos; i++) {
                s = s + String.format("%.0f ", v[i]);
            }
        }
        return s + "\n";
    }
    public void bubbleSort () {
        //int cont=0;
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                //cont++;
                if (v[j] > v[j+1]) {
                    double aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        //return cont;
    }
    public void preencheVetor () {
        Random r = new Random();
        for (int i=0; i<v.length; i++) {
            //adiciona(Math.random());
            //adiciona(r.nextDouble());
            adiciona(r.nextInt(v.length*10) + 1);
        }
    }
    //parte pratica dos exercicios
    //1)
    public void adicionaElementoPisicaoDesejada(double elemento, int pos) {
        if(!estaCheio()){ //vetor precisara ser redimensionado caso ele estiver cheio
            redimensiona(v.length*2);
        }
        else{
            int i;
            for (i = ultimaPos-1; i > pos; i--){//ira correr pelo vetor de tras para frente (i--)
                v[i] = v[i - 1];
            }
            v[i] = elemento; // Insere o novo elemento na posição 'pos'
            ultimaPos++; //atualizando o vetor pois teve um novo item adicionado
        }
    }
    //2)
    public int saberQuantosElementosVetor(int elemento) {
        int contador = 0;
        for (double valor : v){
            if (valor == elemento){
                contador++;
            }
        }
        return contador;
    }
}
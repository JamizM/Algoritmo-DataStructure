//Sabendo disso, vamos criar uma nova Classe, chamada "Vetor", na qual é preciso implementar a estrutura de armazenamento sequencial. Além disso, precisamos inserir um array com 100 posições e implementar os métodos dos comportamentos desse array

import java.util.Arrays;

public class Vetor{
    private Alunos[] alunos = new Alunos[100]; //arrays não sao redimensionais, se caso queira aumentar seu tamanho, terá que criar um outro vetor 
    private int totalDeAlunos = 0; //variavel usada parra controle de alunos inseridos no array

    public void adiciona(int posicao, Alunos aluno){
        this.novoArray(); //chama o método novoArray
        if(!posicaoValida(posicao)) {
            throw new IllegalArgumentException("posicao invalida"); //necessario validação de posição
        }
        for(int i = totalDeAlunos - 1; i >= posicao; i -= 1) {
            alunos[i + 1] = alunos[i]; //vamos arrastar todos os alunos da terceira posição em diante para a direita e colocamos aquele aluno no buraco que ficou
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;

        //redecer o aluno na primeira posição vazia
        // for(int i = 0; i < alunos.length; i++) {
        //     if(alunos[i] == null) {
        //         alunos[i] = aluno;
        //         break; //método deixa o algoritmo menos performativo, pois quanto o maior numero de alunos inseridos no array, m,ais demorado será o método
        //     }
        // }
    }

    public void adiciona(Alunos alunos) { //método adiciona faz com que novos alunos entre na lista do novo array criado
        this.novoArray(); 
        this.alunos[totalDeAlunos] = alunos;
        totalDeAlunos++;
    }

    public Alunos saberPosAlun(int posicao){ //cada metodo sempre precisa retornar algo
       if (!posicaoOcupada(posicao)){
        throw new IllegalArgumentException("posiçao invalida");
       }; //recebe uma posição e devolve o aluno
       return alunos[posicao];
    }

    public void remove(int posicao){
        //remove aluno n e empurramos para a esquerda todos aqueles que vinham depois dele
        for (int i = posicao; i < this.totalDeAlunos; i++){
            this.alunos[i] = this.alunos[i + 1];
        }
        totalDeAlunos--; //decrementa o total de alunos
    }
    
    public boolean contem(Alunos aluno){ //vamos implementar o método "contem". Queremos "perguntar" para a lista se um aluno específico está ou não nela.
        for(int i=0; i < totalDeAlunos; i++){
            if(aluno.equals(alunos[i])) {
                return true; //retorna true se o aluno estiver no vetor
            }
        } //verifica se o aluno está no vetor
        return false; //retorna false se o aluno não estiver no vetor
    }
    //A função equals neste trecho de código é usada para comparar se um objeto aluno é igual a um objeto alunos[i] no vetor. Ela verifica se os dois objetos têm os mesmos valores nos atributos relevantes. Se os objetos forem iguais, o método retorna true, indicando que o aluno está presente no vetor. Caso contrário, retorna false, indicando que o aluno não está no vetor.

    public int tamanho(){
        return totalDeAlunos; //retorna o tamanho do vetor
    }
    
    public String toString() {
        //facilitará na impressão
        return Arrays.toString(alunos);
    }

    private boolean posicaoOcupada(int posicao) { //o tipo de modificação é private pois o método é usado apenas dentro da classe, e não é modificado pelo usuário
        return posicao >= 0 && posicao < totalDeAlunos; //verifica posicao ocupada 
    }

    private boolean posicaoValida(int posicao) { //o tipo de modificação é private pois o método é usado apenas dentro da classe, e não é modificado pelo usuário
        return posicao >= 0 && posicao <= totalDeAlunos;
    }

    private void novoArray(){
        if (totalDeAlunos == alunos.length){
            Alunos[] novoArray2 = new Alunos[alunos.length*2]; //aqui ele ira criar um lovo array e dobrar seu tamanho
            for (int i = 0; i < alunos.length; i++){
                novoArray2[i] = alunos[i]; //alunos do antigo array ira ser atribuido ao novo array
            }
            this.alunos = novoArray2; //o novo array ira ser atribuido ao antigo array
        }
    }
}

import java.util.Random;

public class MeuVetor{
    private double[] v;
    private int ultimaPos;

    public MeuVetor (int capacidade){
        v = new double[capacidade];//array criado 
        ultimaPos = -1; //incializacao dele começa com -1
    }
    //métodos de acesso 
    public int getUltimaPos(){
        return ultimaPos;
    }
    public double[] getV(){ //vetor é uma referencia = ponteiro 
        return v;
    }
    //métodos modificadores 
    public void setUltimaPos(int pos){
        if (pos>= 0 && pos < v.length){ //tamanho do vetor varia de quantos dados forem colocados 
            ultimaPos = pos; //adicionar +1 de dado apos o ultimo colocado
        }
        else{
            ultimaPos = v.length - 1;
        }
    }

    public boolean estaCheio(){
        if (ultimaPos == v.length - 1){
            return true;
        }
        return false;
    }

    public boolean estaVazio(){
        if (ultimaPos == -1){ //n é possivel colocar null, pois a ultimaPos é um inteiro e não um objeto
            return true; 
        }
        return false;
    }

    public void resetVetor(){
        ultimaPos = -1;
    }

    // public boolean adicionado(int elemento){
    //     if (estaCheio())
    //         return false;
    //     ultimaPos++;
    //     v[ultimaPos] = elemento;
    //     return true;
    // }

    public void adicionado(int elemento){
        if (estaCheio()) {
            redimensiona(v.length*2);
        }        
        v[++ultimaPos] = elemento;
    }

    public void adicionado(double elemento){ //sobrecarga de método do adicionado
        if (estaCheio()) {
            redimensiona(v.length*2); //o redimensionamento acontece independente da pratica feita
        }        
        v[++ultimaPos] = elemento;
    }
    public void adicionado(double elemento, int posicao){
        if(estaCheio()){
            redimensiona(v.length*2);
        }
        if(posicao > ultimaPos){
            v[++ultimaPos] = elemento;
        }
        else{
            int i;
            for (i=ultimaPos-1; i>posicao-1; i--){
                v[i] = v[i - 1]; 
            }
            v[i] = elemento; 
            ultimaPos++; 
        }
        //precisa arrastar as posicoes do vetor
    }
    public double removeElemento(){
        if (estaCheio()) return 0; //este return pode ser nao alcançavel
        Double aux = v[ultimaPos--];
        if (v.length>=10 && ultimaPos <= v.length/4){ //aqui  este vetor não deixa ele ficar menor que 10, pois ele precisa de um numero minimo para poder ser redimensionado 
            redimensiona(v.length/2);
        }
        return aux;
    }
    public double removeElementoPosicao(int pos){
        if (pos < 0 || estaVazio() || pos > ultimaPos) return 0;
        double aux = v[pos];
        for (int i = pos; i < ultimaPos; i++){ // se caso escolher a ultima posicao ele não irá precisar arrastar 
            v[i] = v[i + 1];
        }
        ultimaPos--;
            
        if (v.length>=10 && ultimaPos <= v.length/4){ //aqui  este vetor não deixa ele ficar menor que 10, pois ele precisa de um numero minimo para poder ser redimensionado 
            redimensiona(v.length/2);
        }
        return aux;
    }
    public boolean remove(double elemento){
        //remove a primeira ocorrencia do elemento e devolve sucesso ou fracasso
        if(estaVazio()){
            return false;
        }
        else{
            boolean achou = false;
            int i =0;
            while(i<=ultimaPos && !achou){ //se vetor ve na posiacao, achou fica true && i faz parte do controle do for ( i assume varios papeis)
                if (v[i] == elemento) achou = true;
                i++;
            }   
            if (!achou) return false; //varredura se caso nao achar nada, a variavel achou permanece false

            //arrastar os elementos
            for (int j=1; j<ultimaPos; j++){
                v[j] = v[j + 1];
            }
            ultimaPos--; //ajustar posicao
            return true;
        }
    }
    public int removeALL(double elemento){
    //remove todas as ocorrencias do elemento e devolve quantos foram removidos
    int count = 0; 
    // Iterar pelo vetor e remover todas as ocorrências do elemento
    for (int i = 0; i <= ultimaPos; i++) {
        if (v[i] == elemento) {
            // Se encontrarmos uma ocorrência do elemento, removemos
            for (int j = i; j < ultimaPos; j++) {
                v[j] = v[j + 1]; // Deslocar os elementos à esquerda
            }
            ultimaPos--; // Atualizar a última posição ocupada
            count++; // Incrementar o contador de elementos removidos
            i--; // Decrementar o índice para verificar novamente a posição atual
        }
        }
        // Verificar se o vetor precisa ser redimensionado
        if (v.length >= 10 && ultimaPos < v.length / 4) {
            redimensiona(v.length / 2);
        }
         return count; // Retornar o número total de elementos removido
    }
    private void redimensiona(int novaCapacidade){
        double[] temp = new double[novaCapacidade];
            for (int i = 0; i <= ultimaPos; i++){
                temp[i] = v[i]; //copia tudo para dentro da novo Array
        }
        v = temp;
    }

    @Override
    public String toString(){
        String s="";
        if (estaVazio()){
            s = s + "vetor vazio";
        }
        else{
            for (int i=0; i <= ultimaPos; i++){
                s = s + String.format("%.0f", v[i]) + " ";
            }
        }
        s = s + "\n";
        return s;
    }
    public void preencheVetor(){
        Random r = new Random();

        for (int i = 0; i < v.length; i++){
            adicionado(r.nextInt(v.length * 10) + 1); 
        }
    }
    public void preencheVetor(int limiteGeracao){
        Random r = new Random();

        for (int i = 0; i < v.length; i++){
            adicionado(r.nextInt(limiteGeracao) + 1); //
        }
    }
    public int Bubblesort(){
        int cont = 0;
        for (int i=1; i<v.length; i++){
            for (int j = 0; j<v.length-i; j++){ //está varredura é usada para ordenar os numeros de uma forma crescente 
                cont++;
                if (v[j] > v[j + 1]){
                    double aux = v[j]; 
                    v[j] = v[j + 1]; //verificando se os valores que está do lado do outro sao maiores que os outros
                    v[j+1] = aux;
                }
            }
        }
        return cont;
    }
    public Retorno buscaSimples(double x){ //uma classe de retorno foi add para adicionar a incrementacao
        Retorno retorno = new Retorno();
        for (int i = 0; i<v.length; i++){
            retorno.incrementaContador(); //toda vez que ele entra no laço, ele incrementa + 1 para ver se ele achou o valor
            if(v[i] == x){ //vetor na posicao "i" for igual ao x(busca do método)
                retorno.setAchou(true); //se caso encontrar elemento, retorna "true"
                return retorno;
            }
        }
        return retorno;
    }
    public Retorno buscaBinaria(double x){
        Retorno retorno = new Retorno();
        int inicio = 0;
        int fim = v.length - 1;
        int meio;
        while(inicio <= fim){
            meio = inicio + fim / 2;
            retorno.incrementaContador();
            if (x == v[meio]){
                retorno.setAchou(true);
            }
            if(x > meio){
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
        }
        return retorno;
    }
}

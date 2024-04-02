package ListaLigadaSimples;

public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);
        No no3 = new No(30);
        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);
        System.out.println("no2: " + no3);
        
        //atrivuição dos valores para as outras variaveis de referencia
        no1.setProximo(no2); 
        no2.setProximo(no3);

        System.out.println("E agora? " + no1.getProximo()); //exibe o n2 pois, o no1 apresenta a referencia de no2, desta forma acessando um elemento pela referencia dele
        System.out.println("E agora? " + no2.getProximo()); //null, pois ele nao esta referenciando a nada
        System.out.println("E agora? " + no3.getProximo());
        
        
    }
}

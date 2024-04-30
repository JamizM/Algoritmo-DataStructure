package Pilha.ExercicioBeeCrowd_1069;

import java.util.Scanner;

public class BeeCrowd1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int vez = 1; vez <= n; vez++){
            String s = sc.nextLine();
            Pilha pilha = new Pilha();
            int cont = 0;
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '<'){ //verifica se o operador diamante esta aberto
                    pilha.push(s.charAt(i));
                }
                else if (s.charAt(i) == '>'){
                    if (!pilha.estaVazia()) {
                        pilha.pop();
                        cont++;
                    }
                }
            }
            System.out.println(cont);
        }
        sc.close();
    }
}
    
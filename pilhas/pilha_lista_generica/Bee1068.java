import java.util.Scanner;

public class Bee1068 {
    public static void main(String[] args) {
        Pilha<Character> p = new Pilha<>();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean estaCorreta = true;
        for (int i=0; i<s.length() && estaCorreta; i++) {
            if (s.charAt(i) == '(') p.push(s.charAt(i));
            else if (s.charAt(i) == ')') {
                if (p.estaVazia()) estaCorreta = false;
                else p.pop();
            }
        }
        if (!p.estaVazia()) estaCorreta = false;
        if (estaCorreta) System.out.println("esta correto");
        else System.out.println("esta incorreto");
        scanner.close();
    }
}

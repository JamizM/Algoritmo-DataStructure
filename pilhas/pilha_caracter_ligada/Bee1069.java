import java.util.Scanner;

public class Bee1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int vez = 1; vez <= n; vez++) {
            String s = scanner.nextLine();
            //System.out.println(s);
            Pilha p = new Pilha();
            int cont = 0;
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '<')
                    p.push(s.charAt(i));
                else if (s.charAt(i) == '>' && !p.estaVazia()) {
                    p.pop();
                    cont++;
                }
            }
            System.out.println(cont);
        }
        scanner.close();
    }
}

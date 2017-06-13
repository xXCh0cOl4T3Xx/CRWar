package crwar;

import java.util.Scanner;

public class Jogo {

    private int batalhas;

    public Jogo() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do 1° exercito:");
        String ex1 = scan.nextLine();
        System.out.println("Digite o nome do exercito que ira enfrentar o " + ex1 + " :");
        String ex2 = scan.nextLine();
        System.out.println("Qual o numero de batalhas? ");
        this.batalhas = scan.nextInt();
        Exercito exer1 = new Exercito(this.batalhas);
        Exercito exer2 = new Exercito(this.batalhas);

    }

    public void novoAtaque(Exercito ex1, Exercito ex2) {
      
        
    }

    public boolean verificaFim(Exercito exercito, int batalhas) {
        boolean fim = false;
        if ((exercito.getExercito().size() / 100) < (25 / 100)) {
            fim = true;
        }

        return fim;
    }

}

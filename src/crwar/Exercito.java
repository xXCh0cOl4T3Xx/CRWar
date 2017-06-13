package crwar;

import java.util.ArrayList;
import java.util.Random;

public class Exercito {

    private ArrayList<Unidade> exercito = new ArrayList();

    public Exercito(int batalhas) {

        for (int i = 0; i < batalhas; i++) {
            obterUnidade();
        }
    }

    public void obterUnidade() {
        Random rand = new Random();

        int n = rand.nextInt(10);

        if (n < 5) {
            this.exercito.add(new Infantaria());
        } else if (n < 8) {
            this.exercito.add(new Cavalaria());
        } else {
            this.exercito.add(new Catapulta());
        }
    }

    public ArrayList<Unidade> getExercito() {
        return this.exercito;
    }

}

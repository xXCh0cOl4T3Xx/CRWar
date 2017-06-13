package crwar;

public class Cavalaria extends Unidade {

    public Cavalaria() {
        this.identificador = "cavalaria";
    }

    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade unidade) {
        boolean resultado = true;
        if (unidade.identificador.equals("cavalaria")) {
            resultado = true;
        } else if (unidade.identificador.equals("infantaria")) {
            resultado = false;
        } else if (unidade.identificador.equals("catapulta")) {
            resultado = true;
        }

        return resultado;
    }

    @Override
    public String getTipo() {
        return this.identificador;
    }

    @Override
    public String toString() {
        return getTipo();
    }
    
}

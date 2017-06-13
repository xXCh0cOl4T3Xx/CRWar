package crwar;

public class Catapulta extends Unidade {

    public Catapulta() {
        this.identificador = "catapulta";
    }

    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade unidade) {
        boolean resultado = true;
        if (unidade.identificador.equals("cavalaria")) {
            resultado = false;
        } else if (unidade.identificador.equals("infantaria")) {
            resultado = true;
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

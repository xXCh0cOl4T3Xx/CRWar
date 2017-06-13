package crwar;

public class Infantaria extends Unidade {

    public Infantaria() {
        this.identificador = "infantaria";
    }

    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade unidade) {
        boolean resultado = true;
        if (unidade.identificador.equals("cavalaria")) {
            resultado = true;
        } else if (unidade.identificador.equals("infantaria")) {
            resultado = true;
        } else if (unidade.identificador.equals("catapulta")) {
            resultado = false;
        }

        return resultado;
    }

    @Override
    public String getTipo() {
        return this.identificador;
    }

    @Override
    public String toString() {
        return  getTipo();
    }
    
}

package crwar;

public abstract class Unidade {

    protected String identificador;

    public  Unidade() {
    }

    public abstract boolean ganhaQuandoAtacadoPor(Unidade unidade);

    public abstract String getTipo();

}

package java.enums;

public enum CredFunction {
    DEBITO("Cartão de débito", 1),
    CREDITO("Cartão de crédito", 2);

    private final String tipo;
    private final int valor;

    CredFunction(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }
    public int getValor() {
        return valor;
    }
}

package java.exeptions;

public class EntradaInvalidaExeption extends RuntimeException {
    public EntradaInvalidaExeption(String message) {
        super("O número digitado não corresponde as opções.");
    }
}

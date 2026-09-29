package java.model.Cards;

public abstract class Card {
    private String numeroCartao;
    private int numeroSeguranca;
    private String nomeTitular;

    public Card(String numeroCartao, int numeroSeguranca, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.numeroSeguranca = numeroSeguranca;
        this.nomeTitular = nomeTitular;
    }

}

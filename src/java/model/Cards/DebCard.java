package java.model.Cards;

import java.enums.CredFunction;

public class DebCard extends Card {
    private CredFunction credFunction;

    public DebCard(String numeroCartao, int numeroSeguranca, String nomeTitular) {
        super(numeroCartao, numeroSeguranca, nomeTitular);
    }
}

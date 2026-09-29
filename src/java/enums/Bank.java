package java.enums;

public enum Bank {
    NUBANK("Nubank"),
    MERCADO_PAGO("Mercado Pago"),
    INTER("Inter"),
    CAIXA("Caixa Econômica Federal"),
    BB("Bank do Brasil"),
    ITAU("Itaú"),
    BRADESCO("Bradesco"),
    SANTANDER("Santander"),
    PICPAY("PicPay"),
    C6_BANK("C6 Bank"),
    PAGBANK("PagBank"),
    PAN("Bank PAN"),
    NEON("Neon"),
    BMG("Bank BMG"),
    BTG_PACTUAL("BTG Pactual"),
    SAFRA("Bank Safra"),
    SICOOB("Sicoob"),
    SICREDI("Sicredi"),
    BANRISUL("Banrisul"),
    BRB("Bank de Brasília"),
    XP("XP"),
    PAY("99Pay"),
    WILL_BANK("Will Bank"),
    PAGSEGURO("PagSeguro"),
    MERCADO_LIVRE("Mercado Livre");

    private final String nomeBanco;

    private Bank(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }
}

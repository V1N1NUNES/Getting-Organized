package java.model;

import java.enums.Bank;

public class BankAccount {
    private Bank tipoBank;
    private double limiteCartaoCredito;
    private double gastoMensal;


    public BankAccount(Bank tipoBank, double limiteCartaoCredito) {
        this.tipoBank = tipoBank;
        this.limiteCartaoCredito = limiteCartaoCredito;
    }

    public Bank getTipoBanco() {
        return tipoBank;
    }

    public double getLimiteCartaoCredito() {
        return limiteCartaoCredito;
    }

    public double getGastoMensal() {
        return gastoMensal;
    }

    public void setLimiteCartaoCredito(double limiteCartaoCredito) {
        this.limiteCartaoCredito = limiteCartaoCredito;
    }

    public void setGastoMensal(double gastoMensal) {
        this.gastoMensal = gastoMensal;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "tipoBank=" + tipoBank +
                ", limiteCartaoCredito=" + limiteCartaoCredito +
                ", gastoMensal=" + gastoMensal +
                '}';
    }
}

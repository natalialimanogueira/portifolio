package org.example;

public class ContaEspecial extends ContaBancaria {
    private Double limite = 1000.00;
    public ContaEspecial(String nomeTitular, Integer numeroConta, String agencia, String dataAbertura, Double saldo) {
        super(nomeTitular, numeroConta, agencia, dataAbertura, saldo);
        this.limite = limite;
    }
    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = Double.valueOf(limite);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeTitular='" + super.getNomeTitular() + '\'' +
                ", numeroConta=" + super.getNumeroConta() +
                ", agencia='" + super.getAgencia() + '\'' +
                ", dataAbertura='" + super.getDataAbertura()+ '\'' +
                '}';
    }
}

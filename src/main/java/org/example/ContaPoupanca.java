package org.example;

public class  ContaPoupanca extends ContaBancaria {
    private Integer diaRedimento = 30;
    private double novoSaldo;

    public ContaPoupanca(String nomeTitular, Integer numeroConta, String agencia, String dataAbertura, Double saldo) {
        super(nomeTitular, numeroConta, agencia, dataAbertura, saldo);
    }

    public int getDiaRedimento() {
        return diaRedimento;
    }
    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "nomeTitular='" + super.getNomeTitular()+ '\'' +
                ", numeroConta=" + "333" +
                ", agencia='" + super.getAgencia()+ '\'' +
                ", saldo=" + super.getSaldo() +
                '}';
    }

}
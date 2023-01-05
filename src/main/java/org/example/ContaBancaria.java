package org.example;

public class ContaBancaria {

    public double getSaldo;
    private String nomeTitular;
        private Integer numeroConta;
        private String agencia;
        private Double saldo;
        private String dataAbertura;
        public ContaBancaria(String nomeTitular, Integer numeroConta, String agencia, String dataAbertura, Double saldo) {
            this.nomeTitular = nomeTitular;
            this.numeroConta = numeroConta;
            this.agencia = agencia;
            this.saldo = saldo;
            this.dataAbertura = dataAbertura;
        }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    @Override
        public String toString() {
            return "ContaBancaria{" +
                    "nomeTitular='" + nomeTitular + '\'' +
                    ", numeroConta=" + numeroConta +
                    ", agencia='" + agencia + '\'' +
                    ", saldo=" + saldo +
                    ", dataAbertura='" + dataAbertura + '\'' +

                    '}';
        }
}

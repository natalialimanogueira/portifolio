package Service;

import org.example.ContaPoupanca;

public class ContaPoupancaService {
    double novoSaldo;
    public Double calcularNovoSaldo(ContaPoupanca conta, Double taxa) {
        this.novoSaldo = conta.getDiaRedimento() + ((conta.getSaldo() * (taxa/100))* conta.getDiaRedimento());
        conta.setSaldo(novoSaldo);
        return novoSaldo;

    }
}

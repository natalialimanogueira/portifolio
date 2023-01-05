package Service;

import org.example.ContaEspecial;

public class ContaEspecialService {
    public Double sacar (ContaEspecial conta, Double valor) {
        if (conta == null) {
            return 0.0;
        }
        do {
            System.out.println("Valor do  saldo na contaBancaria antes de iniciar os saques no limite: " + conta.getSaldo());
            //   300      1000
            if (valor <= conta.getLimite()) {
                //            90        -   100
                conta.setSaldo(conta.getSaldo() - valor);
                conta.setLimite((conta.getLimite() - valor));
                System.out.println("O saldo atualizado na conta especial após o saque no limite é de: " + conta.getSaldo());
                System.out.println("O limete atualizado na conta especial após o saque é de: " + conta.getLimite());
            } else {
                System.out.println(" Saque na conta especial não foi realizado. Valor solicitado é superio ao limite.");
            }
            return conta.getSaldo();
        } while(conta.getSaldo() <= conta.getLimite());

    }
}

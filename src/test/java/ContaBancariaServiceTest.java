import Service.ContaBancariaService;
import org.example.ContaBancaria;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ContaBancariaServiceTest {
    @Test
    public void deveriaDepositarNaContaBancaria() {

        ContaBancariaService contaBancariaService = new ContaBancariaService();
        Double retorno = contaBancariaService.depositar( new ContaBancaria("Natalia", 001, "abc", "19/04", 00.00),100.00);
        assertEquals(   Double.valueOf(100.00), retorno);
    }


}

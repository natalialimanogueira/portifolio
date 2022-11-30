package operaçoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    @Test
    public void somardoisvalorespositivos(){
        Calculadora calc = new Calculadora();
       double soma = calc.somar(1, 9);
        Assertions.assertEquals(10, soma);
    }

    @Test
    public void somardoisvaloresnegativos(){
        Calculadora calc = new Calculadora();
        double soma = calc.somar(-3, -3);
        Assertions.assertEquals(-6, soma);
    }

    @Test
    public void subtrairdoisvalorespositivos(){
        Calculadora calc = new Calculadora();
        double subtrai = calc.subtrair(5, 3);
        Assertions.assertEquals(2, subtrai);
    }

    @Test
    public void subtrairdoisvalorenegativos(){
        Calculadora calc = new Calculadora();
        double subtrai = calc.subtrair(-3, -7);
        Assertions.assertEquals(4, subtrai);
    }
}

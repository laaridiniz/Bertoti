package empresa.desconto;

import empresa.salario.Salario;

import java.math.BigDecimal;

public class CalculadoraINSS {
    public BigDecimal calcular(Salario salario, Desconto desconto){
        return desconto.calcular(salario);
    }
}


package empresa.desconto;

import empresa.salario.Salario;

import java.math.BigDecimal;

public interface Desconto {
    BigDecimal calcular(Salario salario);

}

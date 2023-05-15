package empresa.salario;

import java.math.BigDecimal;

public class Salario {
    private BigDecimal valor;

    public Salario (BigDecimal valor) {

        this.valor = valor;

    }

    public BigDecimal getValor() {

        return valor;

    }
}

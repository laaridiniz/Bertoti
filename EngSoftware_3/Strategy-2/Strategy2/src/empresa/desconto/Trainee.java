package empresa.desconto;

import empresa.salario.Salario;

import java.math.BigDecimal;

public class Trainee implements Descontos {
    public BigDecimal INSS(Salario salario) { return salario.getValor().multiply(new BigDecimal(0.09)); }
    public BigDecimal FGTS(Salario salario) { return salario.getValor().multiply(new BigDecimal(0.08)); }
    public BigDecimal IRRF(Salario salario){ return salario.getValor().multiply(new BigDecimal("0.075")); }
    public BigDecimal VT(Salario salario){
        return salario.getValor().multiply(new BigDecimal("0.06"));
    }

}

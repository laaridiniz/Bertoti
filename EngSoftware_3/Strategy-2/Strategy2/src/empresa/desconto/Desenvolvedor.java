package empresa.desconto;

import empresa.salario.Salario;

import java.math.BigDecimal;

public class Desenvolvedor implements Descontos {

    public BigDecimal INSS(Salario salario) { return salario.getValor().multiply(new BigDecimal(0.12)); }
    public BigDecimal FGTS(Salario salario) { return salario.getValor().multiply(new BigDecimal(0.08)); }
    public BigDecimal IRRF(Salario salario){ return salario.getValor().multiply(new BigDecimal("0.225")); }
    public BigDecimal VT(Salario salario){
        return salario.getValor().multiply(new BigDecimal("0.06"));
    }

}

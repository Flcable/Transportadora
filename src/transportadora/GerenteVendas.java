/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

/**
 *
 * @author Flavio
 */
public class GerenteVendas extends Funcionario{
    public double salarioMensal;
    public double comissaoFixa;
    
    
    public double calcularSalario(){
        double salarioFinal = 0; //Implementar regra de negocio para gerentes de vendas
        double qtdNegocioFechado = 0;
        double salarioMensal = 3000.00;
        double negocioFechado = salarioMensal*0.10;
        double bonus = qtdNegocioFechado * negocioFechado;
        
        if (qtdNegocioFechado > 0) {
            salarioFinal = salarioMensal + bonus;
        }else{
            salarioFinal = salarioMensal;
        }
        return salarioFinal;
    }
    
}

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
public class Vendedor extends Funcionario {
     public double salarioMensal;
    public double comissaoFixa;
    
    
    public double calcularSalario(){
        double salarioFinal = 0; //Implementar regra de negocio para vendedor
        double qtdNegocioFechado = 0;
        double salarioMensal = 1500.00;
        double negocioFechado = salarioMensal*0.5;
        double bonus = qtdNegocioFechado * negocioFechado;
        
        if (qtdNegocioFechado > 0) {
            salarioFinal = salarioMensal + bonus;
        }else{
            salarioFinal = salarioMensal;
        }
        
        
        
        return salarioFinal;
    }
    
}

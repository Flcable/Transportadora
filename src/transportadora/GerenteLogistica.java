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
public class GerenteLogistica extends Funcionario {
     public double salarioMensal;
    public double comissaoTransporte;
    
    
    public double calcularSalario(){
        double salarioFinal = 0; //Implementar regra de negocio para gerentes de vendas
        double qtdCargaTransportada = 0;
        double salarioMensal = 3000.00;
        double cargaTransportada = salarioMensal*0.10;
        double bonus = qtdCargaTransportada * cargaTransportada;
        
        if (qtdCargaTransportada > 0) {
            salarioFinal = salarioMensal + bonus;
        }else {
            salarioFinal = salarioMensal;
        }
        
        return salarioFinal;
    }
    
}

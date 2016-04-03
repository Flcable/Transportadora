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
public class Motorista extends Funcionario{
    public double SalarioHora;
    public double HoraAdicionais;
    
    
    public double calcularSalario(double salarioHora, double horaTrabalhadas, double salarioFinal){
        salarioHora = 15;
        salarioFinal = 0;
        double ht = 0;
        boolean caminhao = true;
        
        
        if (ht > 100 && caminhao == true){
           
            double bonusHora = (salarioHora*0.25) * 30;
            double bonusCarga = (salarioHora*0.10) * 30;
            double hm =  salarioHora*30;
            salarioFinal =( hm +  bonusHora + bonusCarga)* ht;
            
        } else if (ht <= 100 || caminhao == true){
            double bonusCarga = (salarioHora*0.10) * 30;
            double hm =  salarioHora*30;
            salarioFinal =( hm +  bonusCarga)* ht;
            
        } else if (ht > 100 || caminhao == false) {
            double bonusHora = (salarioHora*0.25) * 30;
            double hm =  salarioHora*30;
            salarioFinal =( hm +  bonusHora )* ht;
        }else {
            double hm =  salarioHora*30;
            salarioFinal = hm * ht;
        }       
        return salarioFinal;
    }
}
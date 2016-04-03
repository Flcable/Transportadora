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
public class Motorista extends Funcionario {

    public double SalarioHora;
    public double HoraAdicionais;

    public double calcularSalario(double salarioHora, double horaTrabalhadas, double salarioFinal) {
        boolean caminhao = true;
        salarioHora = 15;
        salarioFinal = 0;
        salarioHora = 15.00;
        double bonusHora = salarioHora * 0.25;
        double salarioBonus = salarioHora + bonusHora;
        double bonusCarga = salarioHora * 0.10;
        double horasTrabalhada = 0; //

        if (horasTrabalhada < 100 && caminhao == false) {

            salarioFinal = salarioHora * horasTrabalhada;

        } else if (caminhao == true) {

            salarioFinal = (salarioBonus + bonusCarga) * horasTrabalhada;

        } else {
            salarioFinal = salarioBonus * horasTrabalhada;
        }

        return salarioFinal;
    }
}

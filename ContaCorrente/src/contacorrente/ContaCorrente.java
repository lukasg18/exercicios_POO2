/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

/**
 *
 * @author lucas
 */
public class ContaCorrente extends Conta implements Tributavel{

    
    @Override
    public double calculaTributos(){
        Conta salConta = new Conta();
        double total;
        salConta.setSaldo(100);
        total = salConta.getSaldo() + (salConta.getSaldo() * 0.10);
        return total;
    }
    
}

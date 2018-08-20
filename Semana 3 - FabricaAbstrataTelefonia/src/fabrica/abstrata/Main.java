/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        String escolha = JOptionPane.showInputDialog("Tim, Vivo ou Claro?");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone?"));
        String texto = JOptionPane.showInputDialog("Mensagem");
        Mensagem msg = new Mensagem(texto);                
        FabricaAbstrataEnvios fabrica = null;                              
        
        if(escolha.equalsIgnoreCase("tim")){
            fabrica = new FabricaTim();
        }else if(escolha.equalsIgnoreCase("vivo")){
            fabrica = new FabricaVivo();            
        } else if(escolha.equalsIgnoreCase("claro")){
            // Add a fábrica claro
            fabrica = new FabricaClaro();
        } else {
            throw new Exception("Não existe essa empresa de telefonia");
        }
        
        EnvioSMS envio = fabrica.criaEnvioSMS();
        if(envio.enviar(msg, telefone)){            
            Cobranca cobranca = fabrica.criaCobranca();
            cobranca.cobrar(telefone);
        }                
    }
    
}

package fabrica.sempadrao;

import fabrica.abstrata.*;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String escolha = JOptionPane.showInputDialog("Tim, Vivo ou Claro?");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone?"));
        String texto = JOptionPane.showInputDialog("Mensagem");
        Mensagem msg = new Mensagem(texto);
        EnvioSMS envio = null;
        Cobranca cobranca = null;
        if (escolha.equalsIgnoreCase("tim")) 
        {
            envio = new EnvioSMSTim("assincrono");
            if (envio.enviar(msg, telefone)) 
            {
                cobranca = new CobrancaTim();
                cobranca.cobrar(telefone);
            }
        }
        else if (escolha.equalsIgnoreCase("vivo")) 
        {
            envio = new EnvioSMSVivo();
            if (envio.enviar(msg, telefone)) 
            {
                cobranca = new CobrancaTim();
                cobranca.cobrar(telefone);
            }
        }
        else if (escolha.equalsIgnoreCase("claro")) 
        {
            envio = new EnvioSMSClaro();
            if (envio.enviar(msg, telefone)) 
            {
                cobranca = new CobrancaClaro();
                cobranca.cobrar(telefone);
            }
        }
    }
}

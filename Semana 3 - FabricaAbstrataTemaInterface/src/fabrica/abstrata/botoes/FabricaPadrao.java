package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author harã heique
 */
public class FabricaPadrao extends FabricaAbstrataBotoes
{
    @Override
    public JButton criaBotaoOK() 
    {
        return new JButton();
    }

    @Override
    public JButton criaBotaoCancel() 
    {
        return new JButton();
    }
}

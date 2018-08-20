
package fabrica.abstrata;

/**
 *
 * @author harã heique
 */
public class FabricaClaro extends FabricaAbstrataEnvios
{
    @Override
    public Cobranca criaCobranca() 
    {
        return new CobrancaClaro();
    }

    @Override
    public EnvioSMS criaEnvioSMS() 
    {
        return new EnvioSMSClaro();
    }   
}

package fabrica.abstrata;

/**
 *
 * @author harã heique
 */
public class CobrancaClaro implements Cobranca
{
    @Override
    public void cobrar(int telefone) 
    {
        System.out.println("Cobrar via operadora claro");
    }
    
}

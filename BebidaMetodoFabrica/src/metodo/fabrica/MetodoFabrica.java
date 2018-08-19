
package metodo.fabrica;


public class MetodoFabrica {

    public static void main(String[] args) {
        Formato formato;
        formato = FabricaFormato.gerarFormato("Refrigerante");
        formato.gera();
        
        formato = FabricaFormato.gerarFormato("Cafe");
        formato.gera();
        
        formato = FabricaFormato.gerarFormato("Cha");
        formato.gera();
        
        formato = FabricaFormato.gerarFormato("Suco");
        formato.gera();
        
    }    
}


package metodo.fabrica;

public class FabricaFormato {

    public static Formato gerarFormato(String formato) {
        Formato gerador = null;
        if (formato.equalsIgnoreCase("Refrigerante")) {
            gerador = new FormatoRefrigerante();
        } else if (formato.equalsIgnoreCase("Cafe")) {
            gerador = new FormatoCafe();
        } else if (formato.equalsIgnoreCase("Cha")) {
            gerador = new FormatoCha();
        } else if (formato.equalsIgnoreCase("Suco")) {
            gerador = new FormatoSuco();
        }
        return gerador;
    }
}

public class GestorPromocions {
    
    public double aplicarPromocio(Entrada entrada, EstrategiaPromocio estrategia) {
        return estrategia.aplicar(entrada);
    }
    
}

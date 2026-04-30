public class PromoEstudiant implements EstrategiaPromocio {
    private ValidadorEstudiant validador;

    // Injecció de dependències
    public PromoEstudiant(ValidadorEstudiant validador) {
        this.validador = validador;
    }

    @Override
    public double aplicar(Entrada entrada) {
        double preu = entrada.getPreuBase();
        if (validador.verificar(entrada.getClientId())) {
            return preu * 0.75;
        }
        return preu;
    }
}

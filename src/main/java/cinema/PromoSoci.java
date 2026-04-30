public class PromoSoci implements EstrategiaPromocio {
    private ClubSocisServei socis;

    // Injecció de dependències
    public PromoSoci(ClubSocisServei socis) {
        this.socis = socis;
    }

    @Override
    public double aplicar(Entrada entrada) {
        double preu = entrada.getPreuBase();
        if (socis.esSoci(entrada.getClientId())) {
            return preu * 0.80;
        }
        return preu;
    }
}

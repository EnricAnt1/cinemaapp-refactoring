public class PromoAniversari implements EstrategiaPromocio {
    @Override
    public double aplicar(Entrada entrada) {
        return entrada.getPreuBase() * 0.50;
    }
}

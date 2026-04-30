import java.util.ArrayList;

public class GestorReserves {
    
    public enum TipusReserva { PE, VIP, NORMAL }
    
    private static final double DESCOMPTE_PE = 0.85;
    private static final double DESCOMPTE_GRUP_PE = 0.95;
    private static final double DESCOMPTE_VIP = 0.70;
    private static final int MINIM_GRUP_PE = 8;

    private ArrayList<int[]> reserves = new ArrayList<>();
    

    public boolean reservar(TipusReserva tipus, int[] seients, double preuPerSeient) {
        if (tipus != null) {
            if (seients != null && seients.length > 0) {
                
                double total = calcularTotal(tipus, seients.length, preuPerSeient);
                
                if (total > 0) {
                    mostrarResum(tipus, seients.length, total);
                    registrarReserva(seients);
                    return true;
                }
            }
        }
        return false;
    }

    private double calcularTotal(TipusReserva tipus, int numSeients, double preuPerSeient) {
        double total = preuPerSeient * numSeients;
        
        if (tipus == TipusReserva.PE) {
            total = total * DESCOMPTE_PE;
            if (numSeients >= MINIM_GRUP_PE) {
                total = total * DESCOMPTE_GRUP_PE;
            }
        } else if (tipus == TipusReserva.VIP) {
            total = total * DESCOMPTE_VIP;
        }
        
        return total;
    }

    private void mostrarResum(TipusReserva tipus, int numSeients, double total) {
        System.out.println("Tipus: " + tipus);
        System.out.println("Num seients: " + numSeients);
        System.out.println("Total: " + total);
    }

    private void registrarReserva(int[] seients) {
        reserves.add(seients);
    }
}
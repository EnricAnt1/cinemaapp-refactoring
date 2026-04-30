public class ReproductorMobil implements ServeiReproductor {
public void reproduir() { System.out.println("Player: reproduint"); }
public void aturar() { System.out.println("Player: aturat"); }
public void ajustarVolum(int nivell) { System.out.println("Volum sistema: " + nivell); }
public void activarSubtitols(String i) { System.out.println("Subtítols: " + i); }
public void enviarAlTelevisio() { System.out.println("Chromecast: enviant..."); }
public void descarregarFitxer() { System.out.println("Descarregant fitxer..."); }
}
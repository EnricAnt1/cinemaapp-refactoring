import java.util.List;
public class Pelicula {
private String titol;
private int anyEstrena;
private double puntuacioMitjana;
private List<String> repartiment;
public Pelicula(String titol, int anyEstrena) {
this.titol = titol;
this.anyEstrena = anyEstrena;
}
public String getTitol() { return titol; }
public int getAnyEstrena() { return anyEstrena; }
public double getPuntuacioMitjana(){ return puntuacioMitjana; }
public List<String> getRepartiment(){ return repartiment; }
/** Carrega les dades des del sistema de fitxers */
public void carregarDesFitxerJSON(String rutaFitxer) {
System.out.println("Carregant des de: " + rutaFitxer);
}
/** Persisteix la pel·lícula a la base de dades */
public void desarABaseDades() {
System.out.println("INSERT INTO pelicula VALUES ('" + titol + "')");
}
/** Genera una fitxa tècnica en format HTML */
public String generarFitxaTecnicaHTML() {
return "<html><body><h1>" + titol + " (" + anyEstrena + ")</h1></body></html>";
}
/** Envia la fitxa per correu electrònic */
public void enviarFitxaPerEmail(String destinatari) {
System.out.println("Enviant fitxa de '" + titol + "' a " + destinatari);
}
/** Recalcula la puntuació mitjana */
public double recalcularPuntuacio(List<Integer> novesPuntuacions) {
if (novesPuntuacions == null || novesPuntuacions.isEmpty()) return puntuacioMitjana;
double suma = 0;
for (int p : novesPuntuacions) suma += p;
puntuacioMitjana = suma / novesPuntuacions.size();
return puntuacioMitjana;
}
}
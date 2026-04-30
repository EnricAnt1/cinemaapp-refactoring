import java.util.ArrayList;
import java.util.List;
public class GestorSessions {
private List<Sala> sales = new ArrayList<>();
private List<Film> films = new ArrayList<>();
private List<Sessio> sessions = new ArrayList<>();
public String programarSessio(int idSala, String titolFilm, String hora, int aforament) {
Sala sala = null;
for (Sala s : sales) {
if (s.getId() == idSala) { sala = s; break; }
}
if (sala == null) return "Error: sala no trobada";
if (!sala.isOperativa()) return "Error: sala no operativa";
Film film = null;
for (Film f : films) {
if (f.getTitol().equals(titolFilm)) { film = f; break; }
}
if (film == null) return "Error: film no trobat al catàleg";
for (Sessio s : sessions) {
if (s.getSala().getId() == idSala && s.getHora().equals(hora)) {
return "Error: la sala ja té una sessió a aquesta hora";
}
}
if (aforament < 10) return "Error: aforament mínim 10 espectadors";
if (aforament > sala.getCapacitat()) return "Error: aforament supera la capacitat de la sala";
Sessio novaSessio = new Sessio(sala, film, hora, aforament);
sessions.add(novaSessio);
System.out.println("Sala " + sala.getNom() + " — " + film.getTitol() + " a les " + hora);
System.out.println("Aforament: " + aforament + " espectadors");
System.out.println("Sessió #" + novaSessio.getId() + " creada.");
return "OK: sessió " + novaSessio.getId();
}
}
import java.util.ArrayList;
import java.util.List;

public class GestorSessions {
    private List<Sala> sales = new ArrayList<>();
    private List<Film> films = new ArrayList<>();
    private List<Sessio> sessions = new ArrayList<>();
    private static final int MIN_AFORAMENT = 10;

    /*
     * Responsabilitats originals del mètode programarSessio:
     * 1. Cercar la sala a la base de dades (llista) i comprovar si és operativa.
     * 2. Cercar la pel·lícula (Film) al catàleg.
     * 3. Comprovar la disponibilitat d'horaris de la sala.
     * 4. Validar les regles d'aforament (mínim exigit i màxim de la sala).
     * 5. Enviar les notificacions (imprimir per pantalla els detalls).
     */
    
    public String programarSessio(int idSala, String titolFilm, String hora, int aforament) {
        Sala sala = cercarSala(idSala);
        if (sala == null || !sala.isOperativa()) return "Error: sala no trobada o no operativa";
        
        Film film = cercarFilm(titolFilm);
        if (film == null) return "Error: film no trobat al catàleg";
        
        if (hiHaConflicteHorari(idSala, hora)) return "Error: la sala ja té una sessió a aquesta hora";
        if (!validarAforament(aforament, sala)) return "Error: aforament incorrecte";
        
        Sessio novaSessio = new Sessio(sala, film, hora, aforament);
        sessions.add(novaSessio);
        notificarPersonal(sala, film, hora, novaSessio);
        
        return "OK: sessió " + novaSessio.getId();
    }

    private Sala cercarSala(int idSala) {
        for (Sala s : sales) {
            if (s.getId() == idSala) return s;
        }
        return null;
    }

    private Film cercarFilm(String titol) {
        for (Film f : films) {
            if (f.getTitol().equals(titol)) return f;
        }
        return null;
    }

    private boolean hiHaConflicteHorari(int idSala, String hora) {
        for (Sessio s : sessions) {
            if (s.getSala().getId() == idSala && s.getHora().equals(hora)) return true;
        }
        return false;
    }

    private boolean validarAforament(int aforament, Sala sala) {
        return aforament >= MIN_AFORAMENT && aforament <= sala.getCapacitat();
    }

    private void notificarPersonal(Sala sala, Film film, String hora, Sessio s) {
        System.out.println("Sala " + sala.getNom() + " — " + film.getTitol() + " a les " + hora);
        System.out.println("Aforament: " + aforament + " espectadors");
        System.out.println("Sessió #" + s.getId() + " creada.");
    }
}

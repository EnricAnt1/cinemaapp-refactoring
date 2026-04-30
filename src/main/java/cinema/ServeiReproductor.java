public interface ServeiReproductor {
void reproduir();
void aturar();
void ajustarVolum(int nivell);
void activarSubtitols(String idioma);
void enviarAlTelevisio(); // streaming via Chromecast
void descarregarFitxer(); // descàrrega offline
}
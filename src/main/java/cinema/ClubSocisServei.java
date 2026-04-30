public class ClubSocisServei {
private String jdbcUrl;
private String usuari;
private String contrasenya;
public ClubSocisServei(String jdbcUrl, String usuari, String contrasenya) {
this.jdbcUrl = jdbcUrl;
this.usuari = usuari;
this.contrasenya = contrasenya;
}
public boolean esSoci(int clientId) {
// Simulació: en producció consultaria la base de dades
return clientId % 3 == 0;
}
}
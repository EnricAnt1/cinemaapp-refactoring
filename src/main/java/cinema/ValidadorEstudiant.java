public class ValidadorEstudiant {
private String apiUrl;
private String token;
public ValidadorEstudiant(String apiUrl, String token) {
this.apiUrl = apiUrl;
this.token = token;
}
public boolean verificar(int clientId) {
// Simulació: en producció faria una crida HTTP
return clientId % 2 == 0;
}
}
public class GestorPromocions {
public double aplicarPromocio(Entrada entrada, String codiPromocio) {
double preu = entrada.getPreuBase();
if (codiPromocio.equals("ESTUDIANT")) {
ValidadorEstudiant val = new ValidadorEstudiant(
"https://api.carnet.edu", "TOKEN-123");
if (val.verificar(entrada.getClientId())) preu = preu * 0.75;
} else if (codiPromocio.equals("SOCI")) {
ClubSocisServei socis = new ClubSocisServei(
"jdbc:mysql://localhost/socis", "root", "1234");
if (socis.esSoci(entrada.getClientId())) preu = preu * 0.80;
} else if (codiPromocio.equals("ANIVERSARI")) {
preu = preu * 0.50;
}
return preu;
}
}
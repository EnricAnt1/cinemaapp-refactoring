public class CalculadoraEntrades {
public double calcularPreu(String categoria, boolean esFestiu, boolean teTarjetaFidelitat) {
double preu = 0;
if (categoria.equals("adult")) preu = 9.50;
if (categoria.equals("jove")) preu = 7.00;
if (categoria.equals("jubilat")) preu = 6.50;
if (categoria.equals("infant")) preu = 5.00;
if (esFestiu) preu = preu + 1.50;
if (teTarjetaFidelitat) preu = preu * 0.90;
return preu;
}
}
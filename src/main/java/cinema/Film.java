public class Film {
private int id;
private String titol;
private int duradaMinuts;
public Film(int id, String titol, int duradaMinuts) {
this.id = id;
this.titol = titol;
this.duradaMinuts = duradaMinuts;
}
public int getId() { return id; }
public String getTitol() { return titol; }
public int getDuradaMinuts() { return duradaMinuts; }
}
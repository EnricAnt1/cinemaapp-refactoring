public class Sala {
private int id;
private String nom;
private int capacitat;
private boolean operativa;
public Sala(int id, String nom, int capacitat, boolean operativa) {
this.id = id;
this.nom = nom;
this.capacitat = capacitat;
this.operativa = operativa;
}
public int getId() { return id; }
public String getNom() { return nom; }
public int getCapacitat() { return capacitat; }
public boolean isOperativa(){ return operativa; }
}
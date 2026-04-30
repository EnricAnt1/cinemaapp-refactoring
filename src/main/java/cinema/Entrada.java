public class Entrada {
private int id;
private int clientId;
private double preuBase;
public Entrada(int id, int clientId, double preuBase) {
this.id = id;
this.clientId = clientId;
this.preuBase = preuBase;
}
public int getId() { return id; }
public int getClientId() { return clientId; }
public double getPreuBase() { return preuBase; }
}
import java.util.ArrayList;
public class R {
private ArrayList<int[]> ll = new ArrayList<>();
public boolean proc(String t, int[] s, double pp) {
if (t != null) {
if (s != null && s.length > 0) {
double tot = pp * s.length;
if (t.equals("pe")) {
tot = tot * 0.85;
if (s.length >= 8) {
tot = tot * 0.95;
}
}
if (t.equals("vip")) {
tot = tot * 0.70;
}
if (tot > 0) {
System.out.println("T: " + t);
System.out.println("Nse: " + s.length);
System.out.println("Tot: " + tot);
ll.add(s);
return true;
}
}
}
return false;
}
}
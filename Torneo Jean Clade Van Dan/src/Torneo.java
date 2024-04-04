import java.util.ArrayList;

public class Torneo {
	ArrayList<Luchador> a = new ArrayList<>();

	public void agregarLuchador(Luchador c) {
		this.a.add(c);
	}

	public int insectos() {
		int i = 0;
		for (Luchador c : a) {
			if (c.esInsecto()) {
				i++;
			}
		}
		return i;
	}

	public ArrayList<Luchador> losChuckNorris(int x) {
		ArrayList<Luchador> losChuckNorris = new ArrayList<Luchador>();
		for (Luchador c : a) {
			if (c.esChuckNorris(x)) {
				losChuckNorris.add(c);
			}
		}
		return losChuckNorris;
	}

	public boolean hayUnJiujitsu() {
		for (Luchador c : a) {
			if (c.isJiu()) {
				return true;
			}
		}
		return false;
	}

	public int laCantidadDeJiuJitsus() {
		int jc = 0;
		for (Luchador c : a) {
			if (c.isJiu()) {
				jc++;
			}
		}
		return jc;
	}

	public ArrayList<Luchador> getA() {
		return a;
	}

	public void setA(ArrayList<Luchador> contrincante) {
		this.a = contrincante;
	}
}
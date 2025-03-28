package Lab02;
import java.util.ArrayList;

public class Cajoneria<T> {
    private ArrayList<Caja<T>> cajas = new ArrayList<>();
    public void addCaja(Caja<T> caja) {
        cajas.add(caja);
    }

    public String search(T objeto) {
        for (int i = 0; i < cajas.size(); i++) {
            if (cajas.get(i).getContenido().equals(objeto)) {
                return "Posición: " + (i + 1) + ", Color: " + cajas.get(i).getColor();
            }
        }
        return "no encontrado";
    }

    public T delete(T objeto) {
        for (int i = 0; i < cajas.size(); i++) {
            if (cajas.get(i).getContenido().equals(objeto)) {
                return cajas.remove(i).getContenido();
            }
        }
        return null;
    }
}


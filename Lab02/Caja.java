package Lab02;

public class Caja<T> {
    private String color;
    private T contenido;

    public Caja(String color, T contenido) {
        this.color = color;
        this.contenido = contenido;
    }
}
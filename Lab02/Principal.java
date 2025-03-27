package Lab02;
import Lab02.Chocolatina;
import Lab02.Golosina;
import Lab02.Bolsa;
import java.util.Iterator;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Bolsa < Chocolatina > bolsaCho = new Bolsa < Chocolatina > (3);
        Chocolatina c =  new Chocolatina("La Ibérica");
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        for (Chocolatina chocolatina: bolsaCho) {
            System.out.println("Marca: " + chocolatina.getMarca());
        }

        Bolsa<Golosina> bolsaGolo = new Bolsa<>(3);
        bolsaGolo.add(new Golosina("Chupetin", 5.0));
        bolsaGolo.add(new Golosina("Chinchin", 3.5));
        bolsaGolo.add(new Golosina("Oleole", 3.0));

        System.out.println("Golosinas en la bolsa:");
        for (Golosina golosina : bolsaGolo) {
            System.out.println("Nombre: " + golosina.getNombre() + "  Peso: " + golosina.getPeso());
        }
    }
}
package Lab02;
import Lab02.Chocolatina;
import Lab02.Golosina;
import Lab02.Bolsa;
import java.util.Iterator;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Bolsa < Chocolatina > bolsaCho = new Bolsa < Chocolatina > (3);
        Chocolatina c =  new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        for (Chocolatina chocolatina: bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }
    }
}